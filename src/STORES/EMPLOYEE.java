package STORES;

public class EMPLOYEE {
	private int EMP_NUMBER;
	private String emp_name;
	private int FK_OUTLET_NUMBER;
	
	public EMPLOYEE(int eMP_NUMBER, String emp_name, int fK_OUTLET_NUMBER) {
		super();
		EMP_NUMBER = eMP_NUMBER;
		this.emp_name = emp_name;
		FK_OUTLET_NUMBER = fK_OUTLET_NUMBER;
	}

	public int getEMP_NUMBER() {
		return EMP_NUMBER;
	}
	public void setEMP_NUMBER(int eMP_NUMBER) {
		EMP_NUMBER = eMP_NUMBER;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public int getFK_OUTLET_NUMBER() {
		return FK_OUTLET_NUMBER;
	}
	public void setFK_OUTLET_NUMBER(int fK_OUTLET_NUMBER) {
		FK_OUTLET_NUMBER = fK_OUTLET_NUMBER;
	}
}
