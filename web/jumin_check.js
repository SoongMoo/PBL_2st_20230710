function validateKoreanResidentRegistrationNumber(input) {
  // 정규 표현식을 사용하여 주민번호 패턴을 검사합니다.
  var pattern = /^[0-9]{6}-[1-4][0-9]{6}$/;

  if (!pattern.test(input)) {
    return false; // 패턴이 일치하지 않으면 유효하지 않음
  }

  // 주민번호 유효성 검사 로직을 추가합니다.
  var digits = (input.replace("-", "")).split("").map(Number);
  var checksum = 0;

  for (var i = 0; i < 12; i++) {
    checksum += digits[i] * (i % 8 + 2);
  }

  var remainder = checksum % 11;
  var checkDigit = (11 - remainder) % 10;

  if (checkDigit === digits[12]) {
    return true; // 유효한 주민번호
  } else {
    return false; // 유효하지 않은 주민번호
  }
}

// 주민번호 검증 예제
var inputResidentNumber = "YYMMDD-abcdefg"; // 주민번호를 여기에 입력
if (validateKoreanResidentRegistrationNumber(inputResidentNumber)) {
  console.log("유효한 주민번호입니다.");
} else {
  console.log("유효하지 않은 주민번호입니다.");
}
