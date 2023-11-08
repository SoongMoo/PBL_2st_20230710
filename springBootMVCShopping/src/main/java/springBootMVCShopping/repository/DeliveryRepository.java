package springBootMVCShopping.repository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import springBootMVCShopping.command.DeliveryCommand;

@Repository
public class DeliveryRepository {
	@Autowired
	SqlSession sqlSession;
	String namespace = "springBootMVCShopping.repository.DeliveryRepositorySql";
	String statement;
	public Integer delveryInsert(DeliveryCommand deliveryCommand) {
		statement = namespace + ".deliveryInsert";
		return sqlSession.insert(statement, deliveryCommand);
	}
	public Integer deliveryDelete(String purchaseNum) {
		statement = namespace + ".deliveryDelete";
		return sqlSession.delete(statement,purchaseNum);
	}
	public Integer deliveryStateUpdate(String purchaseNum) {
		statement = namespace + ".deliveryStateUpdate";
		return sqlSession.update(statement,purchaseNum);
	}
}
