package springioc.application;

public class DataResource {

	private String driverClassName;
	private String url;
	private String userName;
	private String password;

	public DataResource() {
		super();
	}

	public DataResource(String driverClassName, String url, String userName, String password) {
		super();
		this.driverClassName = driverClassName;
		this.url = url;
		this.userName = userName;
		this.password = password;
	}

	public String getDriverClassName() {
		return driverClassName;
	}

	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "DataResource [driverClassName=" + driverClassName + ", url=" + url + ", userName=" + userName
				+ ", password=" + password + "]";
	}

}
