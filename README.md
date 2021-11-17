# Android_MVC_Practice

간단한 번호 저장 앱으로 MVC 패턴을 연습했다.

### MVC란?
M - MODEL - 데이터를 가진다  
V - VIEW - 사용자에게 보여질 화면  
C - CONTROL - 사용자에게 입력을 받고, 모델을 통해 View를 표현  

MVC 패턴에서 입력은 모두 Control에서 발생한다  

안드로이드는 View 와 Control이 공존한다.  
그래서 Fragment나 Activity에서 한번에 처리한다.  
코드 작성에는 용이하겠지만 프로젝트의 크기가 커질수록 스파게티 코드가 될것같다.  
유지보수도 썩 좋은편은 아닌것같다.
