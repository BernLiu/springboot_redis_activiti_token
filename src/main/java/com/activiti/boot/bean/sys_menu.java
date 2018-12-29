package com.activiti.boot.bean;

public class sys_menu {
	private Long menu_id;
	private Long parent_id;
	private Long res_id;  //所属资源
	private String code;  //菜单编码
	private String name;  //菜单名称
	private Long system_id; //系统ID
	private int is_leaf;   //是否末级
	private String view_path; //页面路径
	private String icon;
	private String req_url;
	private String syspertag; //是否系统设项
	private int menuorder;    //顺序
	private int isused;      //是否启用
	private int moduleType;  //菜单类型
	private String remark;  //备注
	private String sort;	//排序
	private String wholeName;    //全名
	public Long getMenu_id() {
		return menu_id;
	}
	public void setMenu_id(Long menu_id) {
		this.menu_id = menu_id;
	}
	public Long getParent_id() {
		return parent_id;
	}
	public void setParent_id(Long parent_id) {
		this.parent_id = parent_id;
	}
	public Long getRes_id() {
		return res_id;
	}
	public void setRes_id(Long res_id) {
		this.res_id = res_id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getSystem_id() {
		return system_id;
	}
	public void setSystem_id(Long system_id) {
		this.system_id = system_id;
	}
	public int getIs_leaf() {
		return is_leaf;
	}
	public void setIs_leaf(int is_leaf) {
		this.is_leaf = is_leaf;
	}
	public String getView_path() {
		return view_path;
	}
	public void setView_path(String view_path) {
		this.view_path = view_path;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getReq_url() {
		return req_url;
	}
	public void setReq_url(String req_url) {
		this.req_url = req_url;
	}
	public String getSyspertag() {
		return syspertag;
	}
	public void setSyspertag(String syspertag) {
		this.syspertag = syspertag;
	}
	public int getMenuorder() {
		return menuorder;
	}
	public void setMenuorder(int menuorder) {
		this.menuorder = menuorder;
	}
	public int getIsused() {
		return isused;
	}
	public void setIsused(int isused) {
		this.isused = isused;
	}
	public int getModuleType() {
		return moduleType;
	}
	public void setModuleType(int moduleType) {
		this.moduleType = moduleType;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	public String getWholeName() {
		return wholeName;
	}
	public void setWholeName(String wholeName) {
		this.wholeName = wholeName;
	}
}
