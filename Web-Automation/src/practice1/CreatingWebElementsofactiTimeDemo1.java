package practice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingWebElementsofactiTimeDemo1 {
	
	public CreatingWebElementsofactiTimeDemo1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	private WebElement username;
	
	public WebElement getusername()
	{
		return username;
	}
	
	private WebElement pwd;
	
	public WebElement getpwd()
	{
		return pwd;
	}
	
	private WebElement loginButton;
	
	public WebElement getloginButton()
	{
		return loginButton;
	}
	
	private WebElement gettingStartedShortcutsPanelId;
	
	public WebElement getgettingStartedShortcutsPanelId()
	{
		return gettingStartedShortcutsPanelId;
	}
	
	@FindBy(xpath="//div[text()='USERS']")
	private WebElement ousers;
	
	public WebElement getusers()
	{
		return ousers;
	}
	
	@FindBy(xpath="//div[text()='Add User']")
	private WebElement adduser;
	
	public WebElement getadduser()
	{
		return adduser;
	}
	
	private WebElement firstName;
	
	public WebElement getfirstName()
	{
		return firstName;
	}
	
	private WebElement lastName;
	
	public WebElement getlastName()
	{
		return lastName;
	}
	
	private WebElement email;
	
	public WebElement getemail()
	{
		return email;
	}
	
	private WebElement userDataLightBox_usernameField;
	
	public WebElement getusernameField()
	{
		return userDataLightBox_usernameField;
	}
	
	private WebElement password;
	
	public WebElement getpassword()
	{
		return password;
	}
	
	private WebElement passwordCopy;
	
	public WebElement getpasswordCopy()
	{
		return passwordCopy;
	}
	
	@FindBy(xpath="//span[text()='Create User']")
	private WebElement createuser;
	
	public WebElement getCreateUser()
	{
		return createuser;
	}
	
	@FindBy(xpath="//span[text()='Save Changes']")
	private WebElement savechanges;
	
	public WebElement getsaveChanges()
	{
		return savechanges;
	}
	
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logout;
	
	public WebElement getlogout()
	{
		return logout;
	}
	
	@FindBy(xpath="//span[text()='Start exploring actiTIME']")
	private WebElement startEA;
	
	public WebElement getStartExploring()
	{
		return startEA;
	}
	
	@FindBy(xpath="//span[text()='demo1, user1']")
	private WebElement user1;
	
	public WebElement getDemoUser1()
	{
		return user1;
	}
	
	@FindBy(xpath="//span[text()='demo2, user2']")
	private WebElement user2;
	
	public WebElement getDemoUser2()
	{
		return user2;
	}
	
	@FindBy(xpath="//span[text()='demo3, user3']")
	private WebElement user3;
	
	public WebElement getDemoUser3()
	{
		return user3;
	}
	
	private WebElement userDataLightBox_deleteBtn;
	
	public WebElement getDelete()
	{
		return userDataLightBox_deleteBtn;
	}
	
	@FindBy(xpath="//span[text()='demo111, User111']")
	private WebElement getUser111;
	
	public WebElement getUser111()
	{
		return getUser111;
	}
	
	@FindBy(xpath="//div[text()='TASKS']")
	private WebElement tasks;
	
	public WebElement getTasks()
	{
		return tasks;
	}
	
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addtask;
	
	public WebElement getAddnewTask()
	{
		return addtask;
	}
	
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement customer;
	
	public WebElement getNewCustomer()
	{
		return customer;
	}
	
	private WebElement customerLightBox_nameField;
	
	public WebElement getEnterCustomerName()
	{
		return customerLightBox_nameField;
	}
	
	private WebElement customerLightBox_descriptionField;
	
	public WebElement getCustomerDiscription()
	{
		return customerLightBox_descriptionField;
	}
	
	@FindBy(xpath="//span[text()='Create Customer']")
	private WebElement createcust;
	
	public WebElement getClickCreateCustomer()
	{
		return createcust;
	}
	
	@FindBy(xpath="//div[@class='editButton available']")
	private WebElement editbutton;
	
	public WebElement getEditButton()
	{
		return editbutton;
	}
	
	@FindBy(xpath="//div[text()='ACTIONS']")
	private WebElement actions;
	
	public WebElement getActions()
	{
		return actions;
	}
	
	@FindBy(xpath="//div[text()='Delete']")
	private WebElement deletepopup;
	
	public WebElement getDeletePopUp()
	{
		return deletepopup;
	}
	
	@FindBy(xpath="//span[text()='Delete permanently']")
	private WebElement deletepermanent;
	
	public WebElement getDeletePermanently()
	{
		return deletepermanent;
	}
	
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[1]")
	private WebElement cross;
	
	public WebElement getCrossButton()
	{
		return cross;
	}
	
	@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
	private WebElement customereditbutton;
	
	public WebElement getEditButtonOfCustomer()
	{
		return customereditbutton;
	}
	
	@FindBy(xpath="//div[@class='nameLabel']")
	private WebElement modifycd;
	
	public WebElement getCustomerModify()
	{
		return modifycd;
	}
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[3]/div/div[1]")
	               
	private WebElement reliance;
	
	public WebElement getReliance()
	{
		return reliance;
	}
	
	@FindBy(xpath="//div[text()='Reliance']")
	private WebElement after;
	
	public WebElement getAfterClickingReliance()
	{
		return after;
	}
	
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[3]/div/div[2]/input")
	private WebElement blank;
	
	public WebElement getBlankReliance()
	{
		return blank;
	}
	
	@FindBy(xpath="//div[text()='+ New Project']")
	private WebElement project;
	
	public WebElement getClickNewProject()
	{
		return project;
	}
	
	private WebElement projectPopup_projectNameField;
	
	public WebElement getEnterProjectName()
	{
		return projectPopup_projectNameField;
	}
	
	private WebElement projectDescriptionField;
	
	public WebElement getProjectDiscription()
	{
		return projectDescriptionField;
	}
	
	@FindBy(xpath="//span[text()='Create Project']")
	private WebElement buttonproject;
	
	public WebElement getCreatePrjectButton()
	{
		return buttonproject;
	}
	
	@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
	private WebElement editproject;
	
	public WebElement getEditButtonProject()
	{
		return editproject;
	}
	
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[2]/div[3]/div/div")
	private WebElement actionsofproject;
	
	public WebElement getActionsofProject()
	{
		return actionsofproject;
	}
	
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[4]/div/div[3]/div")
	private WebElement delpopupofproject;
	
	public WebElement getDeletePopupOfProject()
	{
		return delpopupofproject;
	}
	
	@FindBy(xpath="//*[@id=\"projectPanel_deleteConfirm_submitTitle\"]")
	private WebElement delperpopup;
	
	public WebElement getDeletePermanentlyOfProject()
	{
		return delperpopup;
	}
	
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[2]/div[2]/div/div[1]")
	private WebElement projectnameedit;
	
	public WebElement getProjectNameClick()
	{
		return projectnameedit;
	}
	
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[2]/div[2]/div/div[2]/input")
	private WebElement projectblank;
	
	public WebElement getBlankProjectName()
	{
		return projectblank;
	}
	
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[1]")
	private WebElement crossproject;
	
	public WebElement getCrossButtonOfProject()
	{
		return crossproject;
	}
	
	@FindBy(xpath="//div[text()='Add New Task']")
	private WebElement task;
	
	public WebElement getAddTaskButton()
	{
		return task;
	}
	
	@FindBy(xpath="//div[text()='Create new tasks']")
	private WebElement newtask;
	
	public WebElement getNewTaskButton()
	{
		return newtask;
	}
	
	@FindBy(xpath="//table[@class='createTasksTable hideEstimate']/descendant::td[3]/input")
	private WebElement tdone;
	
	public WebElement getTaskone()
	{
		return tdone;
	}
	
	@FindBy(xpath="//table[@class='createTasksTable hideEstimate']/descendant::tr[7]/td/input")
	private WebElement tdtwo;
	
	public WebElement getTasktwo()
	{
		return tdtwo;
	}
	
	@FindBy(xpath="//table[@class='createTasksTable hideEstimate']/descendant::tr[11]/td/input")
	private WebElement tdthree;
	
	public WebElement getTaskThree()
	{
		return tdthree;
	}
	
	@FindBy(xpath="//table[@class='createTasksTable hideEstimate']/descendant::tr[15]/td/input")
	private WebElement tdfour;
	
	public WebElement getTaskFour()
	{
		return tdfour;
	}
	
	@FindBy(xpath="//table[@class='createTasksTable hideEstimate']/descendant::tr[19]/td/input")
	private WebElement tdfive;
	
	public WebElement getTaskFive()
	{
		return tdfive;
	}
	
	@FindBy(xpath="//span[text()='Create Tasks']")
	private WebElement taskbutton;
	
	public WebElement getCreateTaskButton()
	{
		return taskbutton;
	}
	
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[1]/table/tbody/tr/td[1]/div/div")
	private WebElement taskchk;
	
	public WebElement getTaskCheckBox()
	{
		return taskchk;
	}
	
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[1]/div[3]/div/div/div[4]")
	private WebElement deltask;
	
	public WebElement getDeleteTaskPopUp()
	{
		return deltask;
	}
	
	@FindBy(xpath="//*[@id=\"deleteTaskPopup_deleteConfirm_submitTitle\"]")
	private WebElement deltaskpermanent;
	
	public WebElement getDeleteTaskPermanently()
	{
		return deltaskpermanent;
	}
	
	@FindBy(xpath="//*[@id=\"customerPanel_deleteConfirm_submitTitle\"]")
	private WebElement delcuspermanent;
	
	public WebElement getCustomerPermanentlye()
	{
		return delcuspermanent;
	}
	

}
