package coldMessage;

abstract class Template {
	//better use StringBuilder in order to avoid creation of multiple string objects
	String template;
	String name, companyName, jobDesc;

	public String template(){
		template =  "Hi " + getName() + ",\n\n" + 
					"I see you work at " + getCompanyName() + " " + 
					"as a " + getJobDescription() + ".\n" +
					"I would really appreciate connecting with you.\n\n" + 
					"Regards\n" + 
					"Tanu Batra";
		
		return template;

	}
	public String getName(){
		return  name;
	}
	public String getCompanyName(){
		return companyName;
	}
	public String getJobDescription(){
		return jobDesc;
	}

	public void setName(String name){
		this.name = name;		
	}
	public void setJobName(String jobName){
		this.companyName = jobName;
	}
	public void setJobDescription(String jobDesc){
		this.jobDesc = jobDesc;
	}

}
