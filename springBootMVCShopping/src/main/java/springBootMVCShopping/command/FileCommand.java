package springBootMVCShopping.command;

import lombok.Data;

@Data
public class FileCommand {
	String orgFile;
	String storeFile;
	int qty;
}
