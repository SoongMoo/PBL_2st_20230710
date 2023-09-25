<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport"
            content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
        <title>KG이니시스 결제샘플</title>
        <link rel="stylesheet" href="css/style.css">
		<link rel="stylesheet" href="css/bootstrap.min.css">
		
		<!--테스트 JS--><script language="javascript" type="text/javascript" src="https://stgstdpay.inicis.com/stdjs/INIStdPay.js" charset="UTF-8"></script>
		<!--운영 JS> <script language="javascript" type="text/javascript" src="https://stdpay.inicis.com/stdjs/INIStdPay.js" charset="UTF-8"></script> -->
        <script type="text/javascript">
            function paybtn() {
                INIStdPay.pay('SendPayForm_id');
            }
        </script>
    </head>

    <body class="wrap">

        <!-- 본문 -->
        <main class="col-8 cont" id="bill-01">
            <!-- 페이지타이틀 -->
            <section class="mb-5">
                <div class="tit">
                    <h2>일반결제</h2>
                    <p>KG이니시스 결제창을 호출하여 다양한 지불수단으로 안전한 결제를 제공하는 서비스</p>
                </div>
            </section>
            <!-- //페이지타이틀 -->


            <!-- 카드CONTENTS -->
            <section class="menu_cont mb-5">
                <div class="card">
                    <div class="card_tit">
                        <h3>PC 일반결제</h3>
                    </div>

                    <!-- 유의사항 -->
                    <div class="card_desc">
                        <h4>※ 유의사항</h4>
                        <ul>
                            <li>테스트MID 결제시 실 승인되며, 당일 자정(24:00) 이전에 자동으로 취소처리 됩니다.</li>
							<li>가상계좌 채번 후 입금할 경우 자동환불되지 않사오니, 가맹점관리자 내 "입금통보테스트" 메뉴를 이용부탁드립니다.<br>(실 입금하신 경우 별도로 환불요청해주셔야 합니다.)</li>
							<li>국민카드 정책상 테스트 결제가 불가하여 오류가 발생될 수 있습니다. 국민, 카카오뱅크 외 다른 카드로 테스트결제 부탁드립니다.</li>
                        </ul>
                    </div>
                    <!-- //유의사항 -->


                    <form name="" id="SendPayForm_id" method="post" class="mt-5">
                        <div class="row g-3 justify-content-between" style="--bs-gutter-x:0rem;">
				    
                            <!--label class="col-10 col-sm-2 gap-2 input param" style="border:none;">version</label>
                            <label class="col-10 col-sm-9 input"-->
                                <input type="hidden" name="version" value="1.0">
                            <!--/label-->
				    
                            <label class="col-10 col-sm-2 input param" style="border:none;">gopaymethod</label>
                            <label class="col-10 col-sm-9 input">
                                <input type="text" name="gopaymethod" value="Card:Directbank:vbank">
                            </label>
				    		
				    		<label class="col-10 col-sm-2 input param" style="border:none;">mid</label>
                            <label class="col-10 col-sm-9 input">
                                <input type="text" name="mid" value="${mid }">
                            </label>
				    
                            <label class="col-10 col-sm-2 input param" style="border:none;">oid</label>
                            <label class="col-10 col-sm-9 input">
                                <input type="text" name="oid" value="${orderNumber }">
                            </label>
				    		
				    		<label class="col-10 col-sm-2 input param" style="border:none;">price</label>
                            <label class="col-10 col-sm-9 input">
                                <input type="text" name="price" value="${price }">
                            </label>
				    		
				    		<label class="col-10 col-sm-2 input param" style="border:none;">timestamp</label>
                            <label class="col-10 col-sm-9 input">
                                <input type="text" name="timestamp" value="${timestamp }">
                            </label>
				    
				    
                            <input type="hidden" name="signature" value="${signature }">
				    		<input type="hidden" name="mKey" value="${mKey }">
                            <input type="hidden" name="currency" value="WON">
				    		
				    		
				    		<label class="col-10 col-sm-2 input param" style="border:none;">goodname</label>
                            <label class="col-10 col-sm-9 input">
                                <input type="text" name="goodname" value="테스트상품">
                            </label>
				    		
				    		<label class="col-10 col-sm-2 input param" style="border:none;">buyername</label>
                            <label class="col-10 col-sm-9 input">
                                <input type="text" name="buyername" value="테스터">
                            </label>
				    		
				    		<label class="col-10 col-sm-2 input param" style="border:none;">buyertel</label>
                            <label class="col-10 col-sm-9 input">
                                <input type="text" name="buyertel" value="01012345678">
                            </label>
				    		
				    		<label class="col-10 col-sm-2 input param" style="border:none;">buyeremail</label>
                            <label class="col-10 col-sm-9 input">
                                <input type="text" name="buyeremail" value="test@test.com">
                            </label>
				    		
				    		<input type="hidden" name="returnUrl" value="https://[가맹점도메인]/INIstdpay_pc_return.jsp">
                            <input type="hidden" name="closeUrl" value="https://[가맹점도메인]/close.jsp">
                            
				    		<label class="col-10 col-sm-2 input param" style="border:none;">acceptmethod</label>
                            <label class="col-10 col-sm-9 input">
                                <input type="text" name="acceptmethod" value="HPP(1):below1000:va_receipt">
                            </label>
							
                        </div>
                    </form>
				
				    <button onclick="paybtn()" class="btn_solid_pri col-6 mx-auto btn_lg" style="margin-top:50px">결제 요청</button>
					
                </div>
            </section>
			
        </main>
		
    </body>
</html>