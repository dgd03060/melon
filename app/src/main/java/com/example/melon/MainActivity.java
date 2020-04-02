package com.example.melon;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends Activity {



    //이름,국적,이미지리소스아이디를 가지고 있는 MemberData 클래스의 객체를

    //배열로 보관하기 위한 ArrayList 객체 생성

    //MemberData[] 이렇게 선언하는 일반배열은 배열 개수가 정해져 있어서 나중에 추가,삭제가 불편하죠.

    //배열 요소의 개수를 유동적으로 조절할 수 있는 ArrayList 객체로 data 보관

    ArrayList<MemberData> datas= new ArrayList<MemberData>();



    //ListView 참조변수

    ListView listview;



    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);



        //이번 예제에서는 우선 직접 코딩으로 멤버정보를 입력하고

        //다른 예제에서 추가/삭제 관련 작업을 해보겠습니다.

        //비정상 회담(요즘 유명하기에 허락없이 도용합니다.-_-)멤버 정보 생성


        datas.add( new MemberData("<1>처음처럼", "  엠씨더맥스(M.C the MAX)", R.drawable.mcthemax));

        datas.add( new MemberData("<2>시작", "가호", R.drawable.gaho));

        datas.add( new MemberData("<3>ON", "방탄소년단", R.drawable.bangtan));

        datas.add( new MemberData("<4>그때 그 아인", "김필", R.drawable.gimpil));

        datas.add( new MemberData("<5>아무노래", "지코(ZICO)", R.drawable.zico));

        datas.add( new MemberData("<6>사랑,하자", "수호", R.drawable.suho));

        datas.add( new MemberData("<7>돌덩이", "하현우(국카스텐)", R.drawable.hahyunwoo));

        datas.add( new MemberData("<8>흔들리는 꽃들속에서 네 샴푸향이 느껴진거야", "장범준", R.drawable.jangbumjoon));

        datas.add( new MemberData("<9>WANNABE", "ITZY(있지)", R.drawable.itzy));

        datas.add( new MemberData("<10>00:00", "방탄소년단", R.drawable.bangtan));

        datas.add( new MemberData("<11>작은 것들을 위한 시", "방탄소년단", R.drawable.bangtan2));

        datas.add( new MemberData("<12>Black Swan", "방탄소년단", R.drawable.bangtan));

        datas.add( new MemberData("<13>마음을 드려요", "아이유", R.drawable.aiu));

        datas.add( new MemberData("<14>METEOR", "창모", R.drawable.changmo));

        datas.add( new MemberData("<15>친구", "방탄소년단", R.drawable.bangtan));

        datas.add( new MemberData("<16>Filter", "방탄소년단", R.drawable.bangtan));

        datas.add( new MemberData("<17>Blueming", "아이유", R.drawable.aiu2));

        datas.add( new MemberData("<18>Moon", "방탄소년단", R.drawable.bangtan));

        datas.add( new MemberData("<19>시차", "방탄소년단", R.drawable.bangtan));

        datas.add( new MemberData("<20>Inner Child", "방탄소년단", R.drawable.bangtan));

        datas.add( new MemberData("<21>FIESTA", "IZ*ONE (아이즈원)", R.drawable.aizone));

        datas.add( new MemberData("<22>We are Bulletproof : the Eternal", "방탄소년단", R.drawable.bangtan));

        datas.add( new MemberData("<23>아로하", "조정석", R.drawable.jojungsuk));

        datas.add( new MemberData("<24>Louder than bombs", "방탄소년단", R.drawable.bangtan));

        datas.add( new MemberData("<25>욱 (UGH!)", "방탄소년단", R.drawable.bangtan));

        datas.add( new MemberData("<26>Interlude : Shadow", "방탄소년단", R.drawable.bangtan));

        datas.add( new MemberData("<27>Made In You", "수호 (SUHO)", R.drawable.suho));

        datas.add( new MemberData("<28>자화상", "수호 (SUHO)", R.drawable.suho));

        datas.add( new MemberData("<29>뜸", "WINNER", R.drawable.winner));

        datas.add( new MemberData("<30>너의 차례 (Feat. 윤하)", "수호 (SUHO)", R.drawable.suho));

        datas.add( new MemberData("<31>O₂", "수호 (SUHO)\n", R.drawable.suho));

        datas.add( new MemberData("<32>Outro : Ego", "방탄소년단", R.drawable.bangtan));

        datas.add( new MemberData("<33>Respect", "방탄소년단", R.drawable.bangtan));

        datas.add( new MemberData("<34>늦은 밤 너의 집 앞 골목길에서", "노을", R.drawable.noel));

        datas.add( new MemberData("<35>암막 커튼", "수호 (SUHO)", R.drawable.suho));

        datas.add( new MemberData("<36>반만", "진민호", R.drawable.jinminho));

        datas.add( new MemberData("<37>Psycho", "Red Velvet (레드벨벳)", R.drawable.redvelbet));

        datas.add( new MemberData("<38>Obsession", "EXO", R.drawable.exo));

        datas.add( new MemberData("<39>너를 사랑하고 있어", "백현 (BAEKHYUN)", R.drawable.bakhyun));

        datas.add( new MemberData("<40>어떻게 지내", "오반\n", R.drawable.oban));

        datas.add( new MemberData("<41>다시 난, 여기", "백예린", R.drawable.backyerin));

        datas.add( new MemberData("<42>2002", "Anne-Marie", R.drawable.anne));

        datas.add( new MemberData("<43>벚꽃 엔딩", "버스커 버스커", R.drawable.busker));

        datas.add( new MemberData("<44>Sweet Night", "V", R.drawable.v));

        datas.add( new MemberData("<45>영웅 (英雄; Kick It)", "NCT 127", R.drawable.nct127));

        datas.add( new MemberData("<46>어떻게 이별까지 사랑하겠어, 널 사랑하는 거지", "AKMU (악동뮤지션)", R.drawable.akmu));

        datas.add( new MemberData("<47>HIP", "마마무 (Mamamoo)", R.drawable.mamamoo));

        datas.add( new MemberData("<48>오늘도 빛나는 너에게 ", "마크툽 (MAKTUB)", R.drawable.marktub));

        datas.add( new MemberData("<49>좋은 사람 있으면 소개시켜줘", "조이 (JOY)", R.drawable.korea));

        datas.add( new MemberData("<50>우리 왜 헤어져야 해", "신예영", R.drawable.sinyeyung));

        datas.add( new MemberData("<51>Birthday", "Anne-Marie", R.drawable.anne2));

        datas.add( new MemberData("<52>Square (2017)", "백예린", R.drawable.backyerin2));

        datas.add( new MemberData("<53>Maniac", "Conan Gray", R.drawable.conan));

        datas.add( new MemberData("<54>안녕", "폴킴", R.drawable.polkim3));

        datas.add( new MemberData("<55>사랑이란 멜로는 없어", "전상근", R.drawable.junssanggeon));

        datas.add( new MemberData("<56>둘만의 세상으로 가", "Crush", R.drawable.crush));

        datas.add( new MemberData("<57>Love poem", "아이유", R.drawable.aiu2));

        datas.add( new MemberData("<58>봄날", "방탄소년단", R.drawable.bangtan3));

        datas.add( new MemberData("<59>bad guy", "Billie Eilish", R.drawable.billie));

        datas.add( new MemberData("<60>Paris In The Rain", "Lauv", R.drawable.lauv));

        datas.add( new MemberData("<61>To Die For", "Sam Smith", R.drawable.samsmith));

        datas.add( new MemberData("<62>어떤 날엔", "김재환", R.drawable.kimjaehwan));

        datas.add( new MemberData("<63>모든 날, 모든 순간", "폴킴", R.drawable.polkim2));

        datas.add( new MemberData("<64>문득", "노을", R.drawable.noel2));

        datas.add( new MemberData("<65>조금 취했어 (Prod. 2soo)", "임재현", R.drawable.imjaehyun2));

        datas.add( new MemberData("<66>시든 꽃에 물을 주듯", "HYNN (박혜원)", R.drawable.bakheywon2));

        datas.add( new MemberData("<67>Dance Monkey", "Tones And I", R.drawable.tone));

        datas.add( new MemberData("<68>주저하는 연인들을 위해", "잔나비", R.drawable.jannabi));

        datas.add( new MemberData("<69>너에게 가는 이 길 위에서 ", "백현 (BAEKHYUN)", R.drawable.bakhyun2));

        datas.add( new MemberData("<70>다시 만날까 봐", "V.O.S", R.drawable.vos));

        datas.add( new MemberData("<71>마음이 말하는 행복", "마크툽 (MAKTUB)", R.drawable.maktub2));

        datas.add( new MemberData("<72>버릇처럼 셋을 센다", "KCM", R.drawable.kcm));

        datas.add( new MemberData("<73>아마두", "염따, 딥플로우, 팔로알토 (Paloalto), The Quiett, 사이먼 도미닉 ", R.drawable.amadoo));

        datas.add( new MemberData("<74>사랑이 식었다고 말해도 돼", "먼데이 키즈 (Monday Kiz)", R.drawable.mondaykiz));

        datas.add( new MemberData("<75>안녕, 오늘의 그대에게", "임한별", R.drawable.imhanbyel));

        datas.add( new MemberData("<76>사랑에 연습이 있었다면 ", "임재현", R.drawable.imjaehyun));

        datas.add( new MemberData("<77>어느 60대 노부부이야기", "임영웅", R.drawable.yungtak));

        datas.add( new MemberData("<78>나의 오랜 연인에게", "다비치", R.drawable.davichi));

        datas.add( new MemberData("<79>Go away go away", "찬열 (CHANYEOL), 펀치 (Punch)", R.drawable.punch));

        datas.add( new MemberData("<80>Painkiller", "Ruel", R.drawable.ruel));

        datas.add( new MemberData("<81>아무렇지 않게, 안녕", "HYNN (박혜원)", R.drawable.bakheywon));

        datas.add( new MemberData("<82>봄 사랑 벚꽃 말고", "HIGH4 (하이포), 아이유", R.drawable.iau3));

        datas.add( new MemberData("<83>포장마차", "황인욱", R.drawable.hwanginwook));

        datas.add( new MemberData("<84>빌었어", "창모 (CHANGMO)", R.drawable.changmo));

        datas.add( new MemberData("<85>찐이야", "영탁", R.drawable.yungtak));

        datas.add( new MemberData("<86>사랑의 인사", "씨야", R.drawable.seeya));

        datas.add( new MemberData("<87>Elevator (127F)", "NCT 127", R.drawable.nct127));

        datas.add( new MemberData("<88>너를 만나", "폴킴", R.drawable.polkim));

        datas.add( new MemberData("<89>내 마음의 사진", "송가인", R.drawable.songgain));

        datas.add( new MemberData("<90>Dreams Come True", "NCT 127", R.drawable.nct127));

        datas.add( new MemberData("<91>메아리 (Love Me Now)", "NCT 127", R.drawable.nct127));

        datas.add( new MemberData("<92>낮잠 (Pandora's Box)", "NCT 127", R.drawable.nct127));

        datas.add( new MemberData("<93>꿈 (Boom)", "NCT 127", R.drawable.nct127));

        datas.add( new MemberData("<94>Sit Down!", "NCT 127", R.drawable.nct127));

        datas.add( new MemberData("<95>뭔가 잘못됐어", "권진아", R.drawable.kwunjina));

        datas.add( new MemberData("<96>뿔 (MAD DOG)", "NCT 127", R.drawable.nct127));

        datas.add( new MemberData("<97>Not Alone", "NCT 127", R.drawable.nct127));

        datas.add( new MemberData("<98>우산 (Love Song)", "NCT 127", R.drawable.nct127));

        datas.add( new MemberData("<99>Interlude: Neo Zone", "NCT 127", R.drawable.nct127));

        datas.add( new MemberData("<100>백야 (White Night)", "NCT 127", R.drawable.nct127));




        //ListView 객체 찾아와서 참조

        listview= (ListView)findViewById(R.id.listview);
        //AdapterView의 일종인 ListView에 적용할 Adapter 객체 생성

        //MemberData 객체의 정보들(이름, 국적, 이미지)를 적절하게 보여줄 뷰로 만들어주는 Adapter클래스 객체생성

        //이 예제에서는 MemberDataAdapter.java 파일로 클래스를 설계하였음.

        //첫번재 파라미터로 xml 레이아웃 파일을 객체로 만들어 주는 LayoutInflater 객체 얻어와서 전달..

        //두번째 파라미터는 우리가 나열한 Data 배열..

        MemberDataAdapter adapter= new MemberDataAdapter( getLayoutInflater() , datas);



        //위에 만든 Adapter 객체를 AdapterView의 일종인 ListView에 설정.

        listview.setAdapter(adapter);





    }

}


