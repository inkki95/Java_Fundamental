워드 시트 https://docs.google.com/spreadsheets/d/1AJACrAzcSC1yYC_Qa6eQu_oS0usaggwyActXyLhm_BI/edit#gid=17578962

jre downlaod   https://java.com/ko/download/windows-64bit.jsp
eclipse downolaod    https://www.eclipse.org/downloads/
jdk 11 download    https://www.oracle.com/technetwork/java/javase/downloads/jdk11-downloads-5066655.html
드롭박스 qbslqbslxl@naver.com  1
깃 inkki95 qbslqbslxl@naver.com  3641

자바 프로젝트 만들면 데이터셋 맞춰줘야함 ms949가 기본값이나 표준이 아님(깃허브에 올리게되면 깨짐)
 -> UTF-8로 변경
이클립스로 자바 환경에서 코딩

src 소스코드 우측 New 자바 클래스 생성


-----실무에서 80~90프로가 자바를 사용함

변수 = 식별자   ex) A       int A = 100;
값 = 리터럴      ex) 100

int 숫자
float 소수점까지
boolean 참거짓 판별
char 

*****1바이트 = 8비트 =  2의 8승 256 (-128 ~ 127 범위)
byte 1바이트
short 2바이트
int 4바이트 -> 2의 32승 넘어서 다른 버전 사용
long 8바이트
(정수형 자료형 위중에 int랑 long 많이 사용)

char 2바이트

소수점은 float double 중 더블을 많이씀

8진수 숫자 앞에 0
16진수 숫자 앞에 0x

**long은 변수뒤에 l을 붙임 long test = 10l;
**float test = 10f;  -> f 붙여야함
**double test = 10d;

Char 
1. 문자표기법 (가장기본) : char test = 'a';
2. 유니코드 char test = '|u0061':
3. 아스키보드 char test = 97;


\n 라인피드 (역슬러쉬)
\t Tab
\r 

ip 192.168.0.4   ->  1바이트씩 4바이트 (255숫자까지가능)

**** int 범위 -20억~20억 초과하면 오버플로우

a/b 나눈 몫
a%b 나눈 나머지

i++ ( i가 1씩 증가)

// 컨트롤 쉬프트 F =>> 들여쓰기 이쁘게

&& 논리연산 (T && T -> T) AND 연산
|| 논리연산 OR 연산

조건문 if switch case 
반복문 for while

<<<<switch는 해당 case에 들어가서 break를 만날때까지 수행.>>>
<<< switch 보다 if 문으로 가능 >>>




깃 bash
1)
mk dir
cd HelloGit
git init
git status -> 빨간글씨 -> 트렉추가안댄것 git add
초록색 글씨 
commit 시켜야댐
git commit -m "2020-05-12-v1"
git config --global user.email "  "
git config --global user.name "  "
git commit -m "2020-05-12-v1"

깃허브에서 
git remote add origin https://github.com/inkki95/HelloGit.git
드래그 복사
git push -u origin master

2) 이클립스로 깃에 올리기
자바 판다멘탈 -> 팀-> 쉐어 -> 피니시
윈도우 쇼 뷰 ->아더-> 깃 검색->깃 스테이깅
언스테이그를 스테이그로 드래그
커밋하기
커밋앤푸쉬 : 바로 서버에올라감
쓰기(메모랑같이)
URL https://github.com/inkki95/JavaFundamental.git 넣기

cd ..
cd C
cd 경로
rm -rf .git -> 깃 디렉토리 삭제 , 연결끊기, 마스터사라짐



<다시 연결방법>
이클립스로 깃 연결
자바 판다멘탈 폴더 우클릭 팀 -> 쉐어 프로젝트 ->폴더생성 -> git 생성됨 -> 피니시

깃 디렉트릭중에서 소스파일만 올리고싶음 bin빼고 셋팅빼고 클라스패치빼고 프로젝트 빼고

-> 깃 bash에서
vi (편집기)
vi .gitignore 에서 i누르고 편집
/bin/
/.settings/
.classpath
.project

esc
 쉬프트 세미콜론 wq 엔터
 
 
 윈도우 쇼뷰 아더 git staging

  
 git bash에서 깃 디렉토리 날리기
 cd .. 상위 경로
 cd 파일이름
 rm -rf .git
 ls -alt 숨긴파일까지보기
 ls 파일보기

 다시 이클립스로 연결
 프로젝트 우클릭- 팀- 쉐어프로젝트 - 피니시 -> 깃bash에서 마스터로 바뀜 (깃 디렉트리 설정, 생성)
 깃스테이징 - 커밋 - 깃허브 URL 입력 넥스트 - 깃허브에 올라감

 집
 import 프로젝트 ㅡ> 깃 -> 클론 URI 로 링크복사 -> 자바프로젝트로 new 생성 -> 경로 확인하기(깃허브에서 가져온 소스가 있는 경로)
 커밋앤푸쉬

 학원
 오자마자 떙겨오기 팀->풀
 
 다른 사람 깃허브에서 링크로 땡겨올수있음 -> 깃 리포짓토리에 목록이 생김

 
 
 
 배열 : 같은 자료형의 묶음
 1. int[] a = new int[size];
 2. int[] a = {1,2,3,4};
 
 
 레퍼런스 타입끼리는 동기화가됨
 int a1 = 10;
 int b1 = a1; ==========>>>> 할당
int[] a = {1,2,3,4};
 int[] c = a; ===========>>>> 참조
		 
배열 동적할당 가능
int[][] a = new int [3][빈칸] //빈칸이면 동적할당
		int[][] a = {{10,20},{10,20,30},{10,20,30,40}}
 int[][] a = new int [4][2];
 -> 방이 4개인데 각각 방마다 길이가 2이다.
 일반적으로 자바 환경에서는 배열이 늘어나지 않음								
 
 OOP
 객체지향 : 모든 사물은 객체화할 수 있다.는 이론
 

public class ClassDemo {
 }
 
 class Demo2 {
 // public은 1개만
 	
 	public static void main(String[] args) {
 // main함수는 파일이름 ClassDemo 이랑같은 클래스 ClassDemo 에만 들어감
 	}
 }
 
 인스탄스 변수 int age
 클래스 변수 
 
 
 
 

 