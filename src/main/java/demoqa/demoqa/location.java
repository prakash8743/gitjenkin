package demoqa.demoqa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import demoqa.browsing;

public class location extends browsing
{
	@FindBy(xpath="//div[@id='app' ]/div/div/div[2]/div/div[1]")
	private  WebElement element;
	@FindBy(xpath="//*[@id='item-0']")
	private WebElement textbox;
	@FindBy(xpath="//input[@id='userName']")
	private WebElement fullname;
	@FindBy(xpath="//input[@id='userEmail']")
	private WebElement email;
	@FindBy(xpath="//*[@id='currentAddress']")
	private WebElement currentaddress;
	@FindBy(xpath="//*[@id='permanentAddress']")
	private WebElement currentaddress1;
	@FindBy(xpath="//button[@id='submit']")
	private WebElement submit;
	@FindBy(xpath="//*[@id='item-1']")
	private WebElement checkbox;
	@FindBy(xpath="//*[@class='rct-icon rct-icon-expand-close']")
	private WebElement expand;
	@FindBy(xpath="//label[@for='tree-node-desktop']//span[@class='rct-checkbox']")
	private WebElement desktop;
	@FindBy(xpath="//*[@id=\"tree-node\"]/ol/li/ol/li[1]/span/button")
	private WebElement desktop1;
	@FindBy(xpath="//*[@id=\"tree-node\"]/ol/li/ol/li[2]/span/button")
	private WebElement documents;
	@FindBy(xpath="//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[1]/span/button")
	private WebElement workspace;
	@FindBy(xpath="//*[@id=\"item-2\"]")
	private WebElement radiobutton;
	@FindBy(xpath="//*[@id=\"item-3\"]")
	private WebElement table;
	@FindBy(xpath="//*[text()='Upload and Download']")
	private WebElement upload;
	@FindBy(xpath="//input[@id='uploadFile']")
	private WebElement choosefile;
	@FindBy(xpath="//a[@id='downloadButton']")
	private WebElement download;
	@FindBy(xpath="//div[@id='app']/div/div/div[2]/div/div/div/div[2]/span/div")
	private WebElement form;
	
	public WebElement getForm() {
		return form;
	}

	public void setForm(WebElement form) {
		this.form = form;
	}

	public WebElement getDownload() {
		return download;
	}

	public void setDownload(WebElement download) {
		this.download = download;
	}

	public WebElement getChoosefile() {
		return choosefile;
	}

	public void setChoosefile(WebElement choosefile) {
		this.choosefile = choosefile;
	}

	public WebElement getUpload() {
		return upload;
	}
	
	public void setUpload(WebElement upload) {
		this.upload = upload;
	}
	public WebElement getTable() {
		return table;
	}
	public void setTable(WebElement table) {
		this.table = table;
	}
	public WebElement getRadiobutton() {
		return radiobutton;
	}
	public void setRadiobutton(WebElement radiobutton) {
		this.radiobutton = radiobutton;
	}
	@FindBy(xpath="//div[@class='custom-control custom-radio custom-control-inline']//input[@id='impressiveRadio']")
	private WebElement radio;




	public WebElement getRadio() {
		return radio;
	}
	public void setRadio(WebElement radio) {
		this.radio = radio;
	}
	public WebElement getDocuments() {
		return documents;
	}
	public void setDocuments(WebElement documents) {
		this.documents = documents;
	}
	public WebElement getWorkspace() {
		return workspace;
	}
	public void setWorkspace(WebElement workspace) {
		this.workspace = workspace;
	}
	public WebElement getDesktop1() 
	{
		return desktop1;
	}
	public void setDesktop1(WebElement desktop1) {
		this.desktop1 = desktop1;
	}
	public WebElement getDesktopcmd() {
		return desktopcmd;
	}
	public void setDesktopcmd(WebElement desktopcmd) {
		this.desktopcmd = desktopcmd;
	}
	@FindBy(xpath="//label[@for='tree-node-commands']")
	private WebElement desktopcmd;
	public WebElement getDesktop() {
		return desktop;
	}
	public void setDesktop(WebElement desktop) {
		this.desktop = desktop;
	}
	public WebElement getElement() {
		return element;
	}
	public WebElement getCheckbox() {
		return checkbox;
	}
	public void setCheckbox(WebElement checkbox) {
		this.checkbox = checkbox;
	}
	public WebElement getExpand() {
		return expand;
	}
	public void setExpand(WebElement expand) {
		this.expand = expand;
	}
	public void setElement(WebElement element) {
		this.element = element;
	}
	public WebElement getTextbox() {
		return textbox;
	}
	public void setTextbox(WebElement textbox) {
		this.textbox = textbox;
	}
	public WebElement getFullname() {
		return fullname;
	}
	public void setFullname(WebElement fullname) {
		this.fullname = fullname;
	}
	public WebElement getEmail() {
		return email;
	}
	public void setEmail(WebElement email) {
		this.email = email;
	}
	public WebElement getCurrentaddress() {
		return currentaddress;
	}
	public void setCurrentaddress(WebElement currentaddress) {
		this.currentaddress = currentaddress;
	}
	public WebElement getCurrentaddress1() {
		return currentaddress1;
	}
	public void setCurrentaddress1(WebElement currentaddress1) {
		this.currentaddress1 = currentaddress1;
	}
	public WebElement getSubmit() {
		return submit;
	}
	public void setSubmit(WebElement submit) {
		this.submit = submit;
	}
	public location()
	{
	PageFactory.initElements(driver, this);	
	}
}
