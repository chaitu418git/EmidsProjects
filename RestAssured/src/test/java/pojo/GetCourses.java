package pojo;

import java.util.List;

public class GetCourses {
private List<WebAutomation> webAutomation;
public List<WebAutomation> getWebAutomation() {
	return webAutomation;
}
public void setWebAutomation(List<WebAutomation> webAutomation) {
	this.webAutomation = webAutomation;
}
private List<Api> api;
private List<Mobile> mobile;

public List<Api> getApi() {
	return api;
}
public void setApi(List<Api> api) {
	this.api = api;
}
public List<Mobile> getMobile() {
	return mobile;
}
public void setMobile(List<Mobile> mobile) {
	this.mobile = mobile;
}
	

}
