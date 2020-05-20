package com.example.bolaapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<clubData> clubs;
    private RecyclerView clubRV;
    private clubDataAdapter clubAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialize();

        setData();

        configClubsRecyclerView();
    }
    private void configClubsRecyclerView() {

        clubRV.setLayoutManager(new LinearLayoutManager(this));
        clubRV.setAdapter(clubAdapter);
    }

    private void setData() {

        clubData club1 =  new clubData(R.drawable.m1a,"Real Madrid","Madrid, Spain","With total revenue of €750.9 Million this year, Real Madrid currently holds the top spot in the list of Richest Football Clubs in the world. After spending almost six seasons in the second position, Real Madrid restored its glory and achieved the top place. And surprisingly enough, even their archrival Barcelona achieved better ranking than the previous year. This year Los Blancos recovered quite a bit and came from second to the top position.\n" + "\n" + "They earned a total of €315.5 Million through the commercial deals with their jersey sponsor Emirates and kit supplier Adidas. Real Madrid also generated €251.3 Million through their broadcast rights and €143.4 Million from their ticket sales. But, their total valuation almost remains the same even after the departure of super-costly footballers such as Cristiano Ronaldo."," $847.7 Million",R.drawable.d1a);
        clubData club2 =  new clubData(R.drawable.m2a,"FC Barcelona","Catalonia, Spain","With a revenue income of €690.4 Million this year, Lionel Messi’s club Barcelona earns the second spot in the Richest Football Clubs 2018/19 list. They lost the top position to their rival club Real Madrid even after generating almost €42 Million more revenue than the previous year. The Catalan side generated €322.6 Million commercial revenue with their sponsorship deals with kit supplier Nike and the shirt sponsor Qatar Airways.\n" + "\n" + "The club made nearly €223 Million this season through their broadcast rights. The matchday income also touched €144.8 Million as they witnessed a significant increase in ticket sales. While the £200-million sale of Neymar didn’t have any impact on the club’s 2019 revenue, but it increased a significant amount of the club’s total valuation to €2.98 Billion."," $779.4 Million",R.drawable.d2a);
        clubData club3 =  new clubData(R.drawable.m3a,"Manchester United","Manchester, England","With €666 Million total revenue this year, Manchester United secured the third place in the list of Richest Football Clubs 2019. Even while securing the third spot, Red Devils faced nearly €10 Million dips in revenue since last year. They generated €316.1 Million commercial income through the sponsorship deals and merchandising. Manchester United earned a decent amount of revenue from their shirt sponsor Chevrolet and the technical kit sponsor Adidas.\n" + "\n" + "They also earned €230.4 Million from their broadcasting rights this year. Besides, Manchester United witnessed €119.5 Million matchday income this season through the ticket sales. According to Deloitte Football Money League, the winning of UEFA Europa League a year back made a significant impact on the club’s revenue this year."," $751.8 Million",R.drawable.d3a);
        clubData club4 =  new clubData(R.drawable.m4a,"FC Bayern Munich","Munich, Germany","German Bundesliga club Bayern Munich holds the fourth place in the ranking of Richest Football Clubs this season. They made a total of €629.2 Million revenue this year which is around €42 Million more than their previous year’s earning. The German side won their domestic league seven times in a row, which in turns increased their overall ticket sales this season. But their bad performance in UEFA Champions League also made quite an impact on their total revenue according to Deloitte Football Money League.\n" + "\n" + "Bayern Munich earned €348.7 Million through the deals with jersey sponsor Deutsche Telekom and technical kit supplier Adidas. They also sold their broadcasting rights for €176.7 Million and generated €103.8 Million more through ticket sales.","$710.3 Million",R.drawable.d4a);
        clubData club5 =  new clubData(R.drawable.m5a,"Manchester City","Manchester, England","Two Premier League clubs made it to the top 5 Wealthiest Football Clubs 2019 as Manchester City also pushed upwards in the list besides Manchester United. With total generated revenue of €568.4 Million this season, the sky blues deserves the fifth place in the current ranking. Through their sponsorship deals and commercial tie-ups, the club made €265.7 Million revenue. Out of which a significant amount came from their main sponsor Etihad Airways and kit sponsor Nike.\n" + "\n" + "The club also made €63.9 Million revenue through their matchday ticket sales. And through their broadcasting rights, Manchester City made €238.8 Million more this year. The saga of becoming English Premier League winner in the 2018/19 season will definitely help the club to generate more revenue in the upcoming seasons.","$641.6 Million",R.drawable.d5a);
        clubData club6 =  new clubData(R.drawable.m6a,"Paris Saint-Germain","Paris, France","French Ligue 1 Club Paris Saint-Germain or PSG currently holds the sixth spot in our list of Richest Football Clubs in 2019. They witnessed a huge surge from previous season’s €486.2 Million revenue to this season’s €541.7 Million revenue. Although the French side has earned an astonishing €313.3 Million from their key sponsor Emirates and kit supplier Nike. Besides, they also earned €127.8 Million through their broadcast rights this season.\n" + "\n" + "PSG generated €100.6 Million matchday revenue from their ticket sales last season. The €230 Million purchase of Neymar significantly increased the total valuation of the French club this season. Their several costly signings this season also gives a hint of their wish to dominate the European football scenario in near-future.","$611.5 Million",R.drawable.d6a);
        clubData club7 =  new clubData(R.drawable.m7a,"Liverpool FC","Liverpool, England","Liverpool became one of the most popular EPL sides in 2019, all thanks to the brilliant performance of Egyptian luminary Mohamed Salah. The Reds achieved the seventh spot in the list of Richest Football Clubs right now with a total generated revenue of €513.7 Million. Unlike several other clubs on the list, Liverpool witnessed a commendable rise of nearly €90 Million from the previous season. They obtained €251.3 Million through their revised broadcasting rights deal.\n" + "\n" + "Liverpool also made €170.8 Million from their commercial deals with shirt sponsor Standard Chartered and kit sponsor New Balance. The club also generated €91.6 Million through the ticket sales on match-days. With several stars on making in the club, football pundits now hope that the total valuation of Liverpool will increase in future.","$579.9 Million",R.drawable.d7a);
        clubData club8 =  new clubData(R.drawable.m8a,"Chelsea FC","East London, England","With €505.7 Million generated revenue, English Premier League side Chelsea earns the eighth place in the current ranking of Richest Football Clubs in this season. Like several other big clubs, the Blues also faced a significant increase in revenue this year. They earned a huge €191.8 Million from their commercial tie-ups, all thanks to their new deal with drinks firm Carabao. Besides, their kit provider Adidas and jersey sponsor Yokohama Tyres also made a good contribution to the club’s total revenue.\n" + "\n" + "Chelsea generated €83.4 Million through their ticket sales on matchdays. And they also earned €230.5 Million from the broadcast rights. The recent €60 Million signing of Alvaro Morata also helped the team to attend a record highest total valuation of €1.52 Billion in 2019.","$570.9 Million",R.drawable.d8a);
        clubData club9 =  new clubData(R.drawable.m9a,"Arsenal FC","North London, England","With a total generated revenue of €439.2 Million this season, Premier League side Arsenal FC earns the ninth place in the current ranking of Richest Football Clubs in the world. They faced around €48-Million dip in revenue than their previous season’s earning. The Gunners earned around €206.9 Million through their broadcast rights and €111.6 Million through the ticket sales. But the main chunk of their total revenue came from their commercial deals worth €120.7 Million this season.\n" + "\n" + "The main contributor to their increased revenue this year, Emirates and Puma, also increased the total brand-value of the club. But their failure to qualify for the UEFA Champions League in season 2019-20, will make an impact on their future ticket sales according to Deloitte.","$495.8 Million",R.drawable.d9a);
        clubData club10 = new clubData(R.drawable.m10a,"Tottenham Hotspurs","North London, England","Tottenham Hotspur earns the 10th spot in the list of Richest Football Clubs in 2019 due to their remarkable €69 Million increase in revenue from the previous season. They witnessed the total revenue of €428.3 Million this year. Spurs made €116.5 Million from their commercial partnerships and merchandising. A majority of which came from their jersey sponsor AIA and technical kit sponsor Nike. They generated €226.6 Million from the broadcasting rights this season.\n" + "\n" + "Besides, they also had a total matchday earning of €85.2 Million from ticket sales last season. According to the recent report by Deloitte, the club may witness an overall rise in revenue in the future. And it can occur due to their steady performance in the Premier League and UEFA Champions League.","$483.5 Million",R.drawable.d10a);

        clubs.add(club1);
        clubs.add(club2);
        clubs.add(club3);
        clubs.add(club4);
        clubs.add(club5);
        clubs.add(club6);
        clubs.add(club7);
        clubs.add(club8);
        clubs.add(club9);
        clubs.add(club10);

    }

    private void initialize() {

        clubs = new ArrayList<>();
        clubRV = findViewById(R.id.clubsRV);
        clubAdapter = new clubDataAdapter(clubs,this);

    }
}
