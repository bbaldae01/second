package team.kitchen.second.bean.employee;


public class EmployeeBean {
	
	private Integer id;
	private String firstName;
	private String lastName;
	private Integer managerId;
	private String managerName;
	private String title;
	private String department;
	private String cellPhone;
	private String officePhone;
	private String email;
	private String city;
	private String pic;
	private String twitterId;
	private String blog;
	private String regdate;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getManagerId() {
		return managerId;
	}
	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getCellPhone() {
		return cellPhone;
	}
	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}
	public String getOfficePhone() {
		return officePhone;
	}
	public void setOfficePhone(String officePhone) {
		this.officePhone = officePhone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public String getTwitterId() {
		return twitterId;
	}
	public void setTwitterId(String twitterId) {
		this.twitterId = twitterId;
	}
	public String getBlog() {
		return blog;
	}
	public void setBlog(String blog) {
		this.blog = blog;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	
	@Override
	public String toString() {
		return "EmployeeBean [id=" + id + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", managerId=" + managerId
				+ ", managerName=" + managerName + ", title=" + title
				+ ", department=" + department + ", cellPhone=" + cellPhone
				+ ", officePhone=" + officePhone + ", email=" + email
				+ ", city=" + city + ", pic=" + pic + ", twitterId="
				+ twitterId + ", blog=" + blog + ", regdate=" + regdate + "]";
	}
	
}
