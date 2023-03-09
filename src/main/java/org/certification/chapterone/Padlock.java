import java.util.concurrent.locks.*;

public class Padlock{
	private Lock lock = new ReentrantLock();
	public void lookUp(){
		if(lock.tryLock()){
			lock.lock();
			lock.lock();
				System.out.println("Locked!");
			lock.unlock();
			//lock.unlock();
			lock.unlock();
		}
	}
	
	public static void main(String... unused) throws Exception{
		var gate = new Padlock();
		for(int i = 0;  i < 5; i ++){
				new Thread(()-> gate.lookUp()).start();
			Thread.sleep(1_000);
		}
	}
}