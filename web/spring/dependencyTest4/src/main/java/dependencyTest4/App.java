package dependencyTest4;

import org.springframework.context.support.GenericXmlApplicationContext;

import dependencyTest4.controller.AppController;

public class App {
	//static BoardRepository boardRepository = new CachedBoardRepository();
	//static BoardPrintService boardPrintService = new BoardPrintService();
	//static Assembler assembler = new Assembler();
	static GenericXmlApplicationContext ctx;
	public static void main(String[] args) {
		ctx = new GenericXmlApplicationContext("classpath:appCtx.xml");
		AppController controller = ctx.getBean("appController",
				AppController.class);
		controller.run();
	}
	
}
