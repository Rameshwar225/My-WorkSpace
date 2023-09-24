package CoreJava;

class Door {
	private Lock lock;
	public Door()
	{
		lock = new Lock(true);
	}
	
	public Lock getLock() {
		return lock;
	}

	public void shopStatus()
	{
		if(lock.isLock())
		{
			System.out.println("Shop is open");
		}
		else
		{
			System.out.println("SHop is close");
		}
	}

	class Lock {
		private boolean lock;

		public Lock(boolean lock) {
			this.lock = lock;
		}

		public void setLock(boolean lock) {
			this.lock = lock;
		}

		public boolean isLock() {
			return lock;
		}

	} 
}

public class MemberInnerClassShopExmple {

	public static void main(String[] args) {
		
		Door door = new Door();
//		
		door.getLock().setLock(false);
		door.shopStatus();
	}

}
