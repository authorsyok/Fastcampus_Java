package Chapter02;

public class MakeReport {

	StringBuilder sb = new StringBuilder();
	
	private String line = "=============================\n";
	private String title = "이름	주소\t전화번호 \t";
	
	private void makeHeader() {
		sb.append(line);
		sb.append(title).append('\n');
		sb.append(line);
	}
	
	private void generateBody() {
		sb.append("James \t");
		sb.append("seoul \t");
		sb.append("010-1234-1234").append('\n');
		
		sb.append("Tomas \t");
		sb.append("busan \t");
		sb.append("010-3333-4444").append('\n');
	}
	
	private void makeFooter() {
		sb.append(line);
	}
	
	public String getReport() {
		makeHeader();
		generateBody();
		makeFooter();
		return sb.toString();
	}
}












