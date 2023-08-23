$(function () {
    $("#frm").submit(function () {
        if ($("#userName").val() == "") {
            alert("이름을 입력해주세요.");
            $("#userName").focus();
            return false;
        }
        if ($("#userId").val() == "") {
            alert("아이디를 입력해주세요.");
            $("#userId").focus();
            return false;
        }
        if ($("#userPw").val() == "") {
            alert("비밀번호를 입력해주세요.");
            $("#userPw").focus();
            return false;
        }
        if ($("#userPwCon").val() == "") {
            alert("비밀번호확인을 입력해주세요.");
            $("#userPwCon").focus();
            return false;
        }
        if ($("#userPw").val() != $("#userPwCon").val()) {
            alert("비밀번호와 비밀번호 확인이 다릅니다.");
            $("#userPw").val("");
            $("#userPwCon").val("");
            $("#userPw").focus();
            return false;
        }
        if (!$(":radio[name='gender']").is(":checked")) {
            alert("성별을 선택해주세요.");
            $(":radio[name='gender']:input[value='F']").prop("checked", true);
            return false;
        }
        if ($("#email").val() == "") {
            alert("이메일을 입력해주세요.");
            $("#email").focus();
            return false;
        }
        if ($("#userTel").val() == "") {
            alert("연락처를 입력해주세요.");
            $("#userTel").focus();
            return false;
        }
    });
});