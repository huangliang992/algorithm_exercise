package �̳߳�.FixedThreadPool;

import java.util.concurrent.ExecutorService;  
import java.util.concurrent.Executors;  
  
/** 
 * ��κ���ع����̳߳ش�С 
 * �����CPU�ܼ���Ӧ�ã����̳߳ش�С����ΪN+1 
        �����IO�ܼ���Ӧ�ã����̳߳ش�С����Ϊ2N+1 
 * http://ifeve.com/how-to-calculate-threadpool-size/ 
 */  
public class TestThreadPool {  
    private static final int NTHREADS = 9;    
    private static final ExecutorService exec = Executors.newFixedThreadPool(NTHREADS);  
//    private static final ExecutorService exec = Executors.newCachedThreadPool();  
    // ʹ�� CachedThreadPool �ȽϺ��ڴ棬���� 200+��ʱ�� ������ڴ����  
    static long tempcount = System.currentTimeMillis()/1000;// ���ڼ���ÿ��ʱ���  
    static int prenum = 200;// ���ڼ�������������  
    static int nums = 200;// ��������  
    static int uses = 0;// ��ʱ ����  
      
    static long allstart = System.currentTimeMillis();// ��������ʱ�� ���ڼ����ܺ�ʱ  
    static long logstime = 0;// ��־�ܺ�ʱ  
      
    public static void main(String[] args)  {  
        //QPS��TPS����ÿ����request/���� ���� ��QPS��TPS��= ������/ƽ����Ӧʱ��  
        //�������� ϵͳͬʱ�����request/������  
        //��Ӧʱ�䣺  һ��ȡƽ����Ӧʱ��  
          
        for (int i = 0; i < nums; i++) {  
            Runnable task = new  Runnable() {    
                @Override  
                public void run() {    
                    try {  
                        long start = System.currentTimeMillis();  
                        task();  
                        long use = System.currentTimeMillis()-start;  
                        System.out.println("������ʱ"+use);  
                        getCurrentThreads(use);  
                    } catch (Exception e) {  
                        e.printStackTrace();  
                    }  
                }  
                  
                /** 
                 * ����Ŀ�� 
                 */  
                public void task(){  
                    try {  
//                      String url = "http://10.0.132.45:8080/filesystemweb/group1/M00/06/EF/CgCAjlhsRRqACEjcAAGcE3wG_pw989.pdf";  
//                      byte[] b = PdfCovertImgUtils.getInstance().getProtocolImg(new URL(url));  
                    } catch (Exception e) {  
                        e.printStackTrace();  
                    }  
                }  
            };    
            exec.execute(task);    
        }  
    }  
  
    /** 
     * ÿ��������� 
     * @param use ���������ʱ 
     */  
    public static void getCurrentThreads(long use){  
//      Map<Thread, StackTraceElement[]> maps = Thread.getAllStackTraces();  
//      System.out.println("Threads:"+maps.size()+"-currentThread:"+Thread.currentThread().getName()+"-"+Thread.currentThread().getId());  
          
        long start = System.currentTimeMillis();  
          
        prenum = prenum-1;// �������� ���ȿۼ�  
        uses += use;  
          
        long now = System.currentTimeMillis()/1000;   
        if(now > tempcount){// ÿ�����һ��  
            long freeMemory=Runtime.getRuntime().freeMemory() / 1024 / 1024;//��ʹ���ڴ�  
            long totalMemory=Runtime.getRuntime().totalMemory() / 1024 / 1024;//�ܹ���ʹ���ڴ�  
            int cpu = Runtime.getRuntime().availableProcessors();//����cpu�߼�������  
              
            System.out.printf("��%s��: ", now-allstart/1000);  
            int ts = (nums-prenum);//ÿ��������  
            System.out.printf("ÿ�봦����:%s ", ts);  
            System.out.printf("ƽ����ʱ:%s ", ts==0?0:uses/ts);  
            System.out.printf("����:%s ", nums);  
            System.out.printf("ʣ��:%s���� ", nums*ts);  
            System.out.printf("�����ڴ�:%sm ", freeMemory);  
            System.out.printf("�������ڴ�:%sm \n", totalMemory);  
            tempcount = now;  
            nums = prenum;  
            uses =0;  
        }  
          
        logstime += System.currentTimeMillis()-start;// ��־��ʱ�ۼ�  
          
        // ������ִ�������Ժ� �����ܺ�ʱ  
        if(prenum==0){  
            long alluse = System.currentTimeMillis()-allstart;  
            System.out.printf("�ܺ�ʱ%s����,������־��ʱ%s����\n",alluse,logstime);  
            System.exit(0);  
        }  
          
    }  
      
}  
