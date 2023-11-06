package springBootMVCShopping.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import springBootMVCShopping.domain.PaymentDTO;
import springBootMVCShopping.domain.PurchaseDTO;
import springBootMVCShopping.domain.PurchaseListDTO;

@Mapper
public interface PurchaseMapper {
	public String selectNum();
	public Integer purchaseInsert(PurchaseDTO dto);
	public int purchaseListInsert(PurchaseListDTO dto);
	public int paymentInsert(PaymentDTO dto);
	public int purchaseStatusUpdate(@Param("status") String status,@Param("purchaseNum") String purchaseNum);
	public PurchaseDTO purchaseSelect(String purchaseNum);
}
