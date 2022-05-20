package src.test.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Sample4 {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\DELL\\eclipse-workspace\\A\\Demo\\Sample Data.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet("Datas");
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {

			Row row = sheet.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {

				Cell cell = row.getCell(j);
				CellType cellType = cell.getCellType();
				switch (cellType) {
				case STRING:
					String text = cell.getStringCellValue();
					System.out.print(text + "     ");
					break;

				case NUMERIC:

					if (DateUtil.isCellDateFormatted(cell)) {
						Date dateCellValue = cell.getDateCellValue();
						SimpleDateFormat dateformat = new SimpleDateFormat("dd-MMM-yyyy");
						String date = dateformat.format(dateCellValue);
						System.out.print(date + "     ");
					} else {
						double d = cell.getNumericCellValue();
						BigDecimal valueOf = BigDecimal.valueOf(d);
						String string = valueOf.toString();
						System.out.print(string + "     ");
					}
					break;

				default:
					break;
				}

			}
			System.out.println();
		}

	}
}
