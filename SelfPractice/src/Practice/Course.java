package Practice;

public class Course {

	private int cid;
	private String cname;
	
	public Course()
	{
		super();
	}
	
	public Course(int cid,String cname)
	{
		this.cid=cid;
		this.cname=cname;
	}
	
	public void setCid(int cid)
	{
		this.cid=cid;
	}
	
	public int getCid()
	{
		return cid;
			
		}
	
	public void setCname(String cname)
	{
		this.cname=cname;
	
		}
	public String getCname()
	{
	return cname;
}
	
	public String toString()
	{
		return "cid "+ cid + "cname " + cname;
	}
	
}