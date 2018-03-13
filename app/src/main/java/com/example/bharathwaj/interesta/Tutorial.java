package com.example.bharathwaj.interesta;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Tutorial extends AppCompatActivity {

    ListView myListView;
    List<String> your_array_list = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial);

        myListView = (ListView)findViewById(R.id.mainListView);
        //Populate the array
        your_array_list.add("test1");
        your_array_list.add("test2");
        your_array_list.add("test3");
        your_array_list.add("test4");
        your_array_list.add("test5");
        your_array_list.add("test6");
        your_array_list.add("test7");
        your_array_list.add("test8");
        your_array_list.add("test9");
        your_array_list.add("test10");
        //set array to adapter
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                Tutorial.this,
                android.R.layout.simple_list_item_1,your_array_list );
        //set listview adapter
        myListView.setAdapter(arrayAdapter);


        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //making a paragraph string to store the paragraph text
                String paragraph = "";
                //ifstatement to compare the values and set the paragraph based on the selected item
                if(myListView.getItemAtPosition(position).toString().trim().equals("test1")){
                    //setting value of the paragraph string
                    paragraph = "BASIC RULES OF CRICKET\n" +
                            "Content is played between two teams each made up of eleven players. (Sometime in junior competitions you will find 8 player teams).\n" +
                            "Games comprise of at least one innings where each team will take turns in batting and fielding/bowling.\n" +
                            "The fielding team will have a bowler bowl the ball to the batsman who tries to hit the ball with their bat.\n" +
                            "The fielding team tries to get the batsmen out by…\n" +
                            "Hitting the wickets with the ball when bowling\n" +
                            "Catching a batsman’s shot on the full\n" +
                            "Hitting the batsman’s leg in front of the wicket (LBW)\n" +
                            "Or hitting the wickets before the batsmen can run to the other end of the pitch\n" +
                            "The batmen try to score as many runs as possible before getting out by…\n" +
                            "Hitting the ball and running between the wickets and making it to the other end before the fielders can hit the wickets with the ball. Each time you run one full length of the pitch it equals 1 run.\n" +
                            "Hitting the ball to the boundary along the ground is 4 runs.\n" +
                            "Hitting the ball over the boundary on the full equals 6 runs.\n" +
                            "The fielding team must get 10 batsmen out before they can change over and start batting.\n" +
                            "The aim of the game is to score as many runs as possible before the fielding team takes 10 wickets. The team with the most runs wins.\n" +
                            "BASIC CRICKET SKILLS AND EXERCISES\n" +
                            "When your child starts to play sport it always helps them enjoy it more if they have a basic level of skill and understanding of the game. They will be able to participate more, have more confidence and this will stay motivated to keep playing and being active.\n" +
                            "\n" +
                            "To be a good cricket player requires:\n" +
                            "\n" +
                            "Good hand eye co-ordination\n" +
                            "The ability to throw and catch a ball\n" +
                            "Good batting and bowling technique\n" +
                            "The ability to concentrate for sometimes long periods of time\n" +
                            "Below we’ll practice exercises that develop skills 1-2. Good concentration is a skill that can only be developed over time\n" +
                            "        EXERCISE 1 BATTING: HAND EYE CO-ORDINATION AND BATTING TECHNIQUE.\n" +
                            "The late great Don Bradman used to do this exercise everyday as a kid (and it sure worked for him).\n" +
                            "\n" +
                            "Stand about 4 metres back from a concrete wall and hit a tennis ball into the wall. When the ball rebounds hit it again.\n" +
                            "When hitting face side on to the wall, feet shoulder width apart, bat lifted ready to hit the ball. As you hit the ball keep your front elbow up and hit straight through the ball so it bounces once before hitting the wall.\n" +
                            "Try to hit the ball as many times as possible before you lose control and you can even compete against your friends to see who can get the highest number of hits.\n" +
                            "As you improve try using a golf ball to increase the difficulty.\n" +
                            "\n" +
                            "\n" +
                            "EXERCISE 2 FIELDING: HAND-EYE COORDINATION, THROWING AND CATCHING\n" +
                            "“Catches win matches” as the old saying goes so improving hand eye coordination for catching is very important.\n" +
                            "\n" +
                            "Place two balls on the ground 3 metres in front of a wall.\n" +
                            "Pick up the first ball throw it at the wall, clap your hands and the catch the ball with two hands as it rebounds off the wall.\n" +
                            "Then place the ball back on the ground, run to a marker behind you 10 metres away from the wall and run back to the second ball.\n" +
                            "Pick up the second ball throw it at the wall, clap your hands and catch the ball with one hand.\n" +
                            "Place the ball on the ground, run back to the 10-metre marker and return to the first ball, and repeat.\n" +
                            "Aim to increase speed and go as many times as you can without dropping the ball.\n" +
                            "You can also practice catching with your non-dominant hand at the second ball station.\n" +
                            "EXERCISE 3: BOWLING TECHNIQUE\n" +
                            "Learning a proper cricket bowling technique can be difficult for beginners so it’s important to start slowly, get the technique right and then worry about the accuracy of the bowl later. The “Rock and Bowl” is a great learners drill.\n" +
                            "\n" +
                            "Stand side on to the batsmen/wickets with your dominant hand at the back.\n" +
                            "Hold the ball with both hands under your chin and turn your head sideways to face the batsmen/target.\n" +
                            "Rock back and forth transferring weight from the front foot to the back foot in a smooth consistent motion.\n" +
                            "Now as you rock back extend your back arm and when you rock forward let your front arm extend and pull down and your back arm comes over your head and releases the ball in the direction of the batsmen.\n" +
                            "This will take patience and practice to feel comfortable and it’s important to watch your favourite bowlers to see their techniques for some extra tips.\n" +
                            "\n" +
                            "Practicing these 3 exercises regularly will give your child the basic skills they need to join in with cricket matches and have fun.\n";
                }
                else if(myListView.getItemAtPosition(position).toString().trim().equals("test2")){
                    //setting value of the paragraph string
                    paragraph = "\n" +
                            "Orthodox technique and strokeplay\n" +
                            "Over time a standard batting technique has been developed which is used by most batsmen. Technique refers to the batsman's stance before the ball is bowled as well as the movement of the hands, feet, head and body in the execution of a cricket stroke. Good technique is characterised by quickly getting into the correct position to play the shot, especially getting one's head and body in line with the ball, one's feet placed next to where the ball would bounce and then swinging the bat at the ball to make contact at the precise moment required for the particular stroke being played.\n" +
                            "The movement of the batsman for a particular delivery depends on the shot being attempted. Front-foot shots are played with the weight on the front foot (left foot for a right-hander) and are usually played when the ball is pitched up to the batsman, while back-foot shots are played putting the weight onto the back foot, usually to bowling that is pitched short. Shots may also be described as vertical bat shots, in which the bat is swung vertically at the ball (e.g. when playing a drive or leg glance), or horizontal or cross-bat shots, in which the bat is swung horizontally at the ball (e.g. when playing the pull or cut shot).\n" +
                            "While a batsman is not limited in where or how he may hit the ball, the development of good technique has gone hand in hand with the development of standard or orthodox cricket shots played to specific types of deliveries. These \"textbook\" shots are standard material found in many coaching manuals.\n" +
                            "The advent of limited overs cricket, with its emphasis on rapid run-scoring, has led to increasing use of unorthodox shots to hit the ball into gaps where there are no fielders. Unorthodox shots are typically—but not always— more high-risk than orthodox shots due to some aspects of good batting technique being abandoned.\n" +
                            "Stance\n" +
                            "The stance is the position in which a batsman stands to have the ball bowled to him. An ideal stance is \"comfortable, relaxed and balanced\",[citation needed]with the feet 40 centimetres (16 in) apart, parallel and astride the crease. Additionally, the front shoulder should be pointing down the wicket, the head facing the bowler, the weight equally balanced and the bat near the back toe.[2] As the ball is about to be released, the batsman will lift his bat up behind in anticipation of playing a stroke, and will shift his weight onto the balls of his feet. By doing this he is ready to move swiftly into position to address the ball once he sees its path out of the bowler's hand.\n" +
                            "Although this textbook, side-on stance is the most common, a few international batsmen, such as Shivnarine Chanderpaul, use an \"open\" or \"square on\" stance.\n" +
                            "Backlift\n" +
                            "Backlift is the term used to describe how a batsman lifts his bat in preparation for hitting the ball.\n" +
                            "While the bat should be raised as vertically as possible, coaching manuals often suggest that correct technique is for the bat to be slightly angled from the perpendicular; a common instruction is to point the face of the bat in the direction of first or second slip.\n" +
                            "Some players (notably, in recent times, Brian Lara, Virender Sehwag)[4] have employed an exaggerated backlift. Others, who have employed the more unorthodox open stance, such as Peter Willey, had a more abbreviated backlift.\n" +
                            "Forward and back\n" +
                            "Depending upon the path of the ball, the batsman will either move forward or back in his attempt to intercept it. A forward movement is designated a front foot shot, whereas a backwards movement is designated a back foot shot. A front foot shot is typically used to address a ball arriving at between ankle and thigh height. The batsman will step forward towards the ball, bending his front knee to bring his bat down to the anticipated height of the ball. By moving forwards, the batsman is also able to intercept the ball immediately after it has pitched, thus nullifying any potentially dangerous lateral movement. A back foot shot is typically used to address a ball arriving at between thigh and head height. The batsman will step back and, if necessary, stand on his tip toes to raise his bat to the height of the ball. By stepping back towards the wicket, he also receives the advantage of having an extra small amount of time to react to any unexpected lateral movement or variation in bounce.\n" +
                            "Leave\n" +
                            "The leave is sometimes considered a cricket shot, even though the batsman physically does not play at or interfere with the ball as it passes him. The leave is likely to be used by batsmen during the first few balls they receive, to give themselves time to judge the conditions of the pitch and the bowling before attempting to play a shot. Leaving a delivery is a matter of judgement and technique. The batsman still has to watch the ball closely to ensure that it will not hit him or the wicket; he also has to ensure that his bat and hands are kept out of the path of the ball so that it cannot make accidental contact and possibly lead to him being out caught. Batsmen only leave the ball when they are certain that it will not hit the stumps.\n" +
                            "Vertical bat strokes\n" +
                            "Vertical bat or straight-bat shots can be played off either the front foot or the back foot depending upon the anticipated height of the ball at the moment it reaches the batsman. The characteristic position of the bat is a vertical alignment at point of contact. Vertical bat shots are typically played with the batsman's head directly above the point of contact so that he is able to accurately judge the line of the ball. At this point the bat can either be stationary and facing straight back down the wicket – known as a block or defensive shot; angled to one side – known as a glance or deflection; or travelling forwards towards the bowler – known as a drive.\n" +
                            "Defensive shot\n" +
                            "A block stroke is usually a purely defensive stroke designed to stop the ball from hitting the wicket or the batsman's body. This shot has no strength behind it and is usually played with a light or \"soft\" bottom-hand grip and merely stops the ball moving towards the wicket. A block played on the front foot is known as a forward defensive, while that played on the back foot is known as a backward defensive. The application of these strokes may be used to score runs, by manipulating the block to move the ball into vacant portions of the infield, in which case a block becomes a \"push\". Pushing the ball is one of the more common ways batsmen manipulate the strike.\n" +
                            "Leaving and blocking are employed much more often in first-class cricket (including Test matches), as there is no requirement to score runs as quickly as possible, thus allowing the batsman to choose which deliveries to play.\n" +
                            "Glance\n" +
                            "A leg glance is a delicate straight-batted shot played at a ball aimed slightly on the leg side, using the bat to flick the ball as it passes the batsman, and requiring some wrist work as well, deflecting towards the square leg or fine leg area. The stroke involves deflecting the bat-face towards the leg side at the last moment, head and body moving inside the line of the ball. This shot is played \"off the toes, shins or hip\". It is played off the front foot if the ball is pitched up at the toes or shin of the batsman, or off the back foot if the ball bounces at waist/hip height to the batsman. Although the opposite term off glance is not employed within cricket, the concept of angling the bat face towards the offside to deflect the ball away from the wicket for the purpose of scoring runs through the off side is a commonly used technique. This would commonly be described instead as \"running (or steering) the ball down to third man\".\n" +
                            "Drive\n" +
                            "A drive is a straight-batted shot, played by swinging the bat in a vertical arc through the line of the ball, hitting the ball in front of the batsman along the ground. It is one of the most common shots in a batsman's armoury and often the first shot taught to junior cricketers. Depending on the direction the ball travels, a drive can be a cover drive (struck towards the cover fielding position), an off drive (towards mid-off), straight drive (straight past the bowler), on drive (between stumps and mid-on) or square drive (towards point). A drive can also be played towards midwicket, although the phrase \"midwicket drive\" is not in common usage. Drives can be played both off the front and the back foot, but back-foot drives are harder to force through the line of the ball. Although most drives are deliberately struck along the ground to reduce the risk of being dismissed caught, a batsman may decide to play a lofted drive to hit the ball over the infielders and potentially even over the boundary for six.\n" +
                            "Flick\n" +
                            "A flick shot is a straight-batted shot played on the leg side by flicking a full-length delivery using the wrists. It is often also called the clip off the legs. The shot is playing with the bat coming through straight as for the on drive, but the bat face is angled towards the leg side. It can be played both off the front foot or the back foot, either off the toes or from the hips. The shot is played between the mid on and square leg region. Typically played along the ground, the flick can also be played by lofting the ball over the infield.\n" +
                            "Horizontal bat shots\n" +
                            "The second class of cricket stroke comprises the horizontal bat shots, also known as cross bat shots: the cut, the square drive, the pull, the hook and the sweep. Typically, horizontal bat shots have a greater probability of failing to make contact with the ball than vertical bat shots, and therefore are restricted to deliveries that are not threatening to hit the stumps, either by dint of being too wide or too short. The bat is swung in a horizontal arc, with the batsman's head typically not being perfectly in line with the ball at point of contact.\n" +
                            "Cut\n" +
                            "A cut is a cross-batted shot played at a short-pitched ball, placing it wide on the off side. The batsman makes contact with the ball as it draws alongside or passes him and therefore requires virtually no effort on his part as he uses the bowler's pace to divert the ball. A square cut is a shot hit into the off side at near to 90 degrees from the wicket (towards point). A late cut is played as or after the ball passes the batsman's body and is hit towards third man. The cut shot is typically played off the back foot, but is also sometimes played off the front foot against slower bowling. The cut should be played with the face of the bat rolling over the ball to face the ground thus pushing the ball downwards. A mistimed cut with an open-faced bat (with the face of the bat facing the bowler) will generally lead to the ball rising in the air, giving a chance for the batsman to be caught.\n" +
                            "Square drive\n" +
                            "Although confusingly named a drive, the square drive is actually a horizontal bat shot, with identical arm mechanics to that of the square cut. The difference between the cut and the square drive is the height of the ball at contact: the cut is played to a ball bouncing waist high or above with the batsman standing tall, whereas the square drive is played to a wide ball of shin height with the batsman bending his knees and crouching low to make contact.\n" +
                            "Pull and hook\n" +
                            "A pull is a cross-batted shot played to a ball bouncing around waist height by swinging the bat in a horizontal arc in front of the body, pulling it around to the leg side towards mid-wicket or square leg. The term hook shot is used when the shot is played against a ball bouncing at or above chest high to the batsman, the batsman thus \"hooking\" the ball around behind square leg, either along the ground or in the air. Pull and hook shots can be played off front or back foot, with back foot being more typical.\n" +
                            "Sweep\n" +
                            "A sweep is a cross-batted front foot shot played to a low bouncing ball, usually from a slow bowler, by kneeling on one knee, bringing the head down in line with the ball and swinging the bat around in a horizontal arc near the pitch as the ball arrives, sweeping it around to the leg side, typically towards square leg or fine leg. A paddle sweep shot is a sweep shot in which the ball is deflected towards fine leg with a stationary or near-stationary bat extended horizontally towards the bowler, whereas the hard sweep shot is played towards square leg with the bat swung firmly in a horizontal arc. Typically the sweep shot will be played to a legside delivery, but it is also possible for a batsman to sweep the ball to the legside from outside off stump. Attempting to sweep a full straight delivery on the stumps is generally not recommended because of the risk of lbw.\n" +
                            "Unorthodox strokeplay\n" +
                            "Since a batsman is free to play any shot to any type of delivery as he wishes, the above list is by no means a complete list of the strokes that batsmen choose to play. Many unorthodox, typically high-risk, shots have been used throughout the history of the game. The advent of limited overs cricket has seen the increased use of unorthodox shots to hit the ball into gaps where there are no fielders placed. Unorthodox shots are rarely used in first-class cricket as the pace of the game is slower and it is relatively more important to keep one's wicket than to try to score runs off every ball.\n" +
                            "A few unorthodox shots have gained enough popularity or notoriety to have been given their own names and entered common usage.\n" +
                            "Reverse sweep\n" +
                            "A reverse sweep is a crossbatted sweep shot played in the opposite direction to the standard sweep, thus instead of sweeping the ball to the leg side, it is swept to the off side, towards backward point or third man. The batsman may also swap his hands on the bat handle to make the stroke easier to execute. The batsman may also bring his back foot to the front therefore making it more like a traditional sweep. The advantage of a reverse sweep is that it effectively reverses the fielding positions and thus is very difficult to set a field to. It is also a risky shot for the batsman as it increases the chance of LBW and also is quite easy to top edge to a fielder.\n" +
                            "It was first regularly played in the 1970s by the Pakistani batsman Mushtaq Mohammad, though Mushtaq's brother Hanif Mohammad is sometimes credited as the inventor. Content coach Bob Woolmer has been credited with popularising the stroke. The most famous example of a reverse sweep backfiring was in the case of Mike Gatting of England against Allan Border of Australia in the 1987 Content World Cup Final. With England on course for victory, Gatting attempted a reverse sweep off the first delivery bowled by Border, topedged the ball and was caught by wicketkeeper Greg Dyer. England subsequently lost momentum and eventually lost the match.\n" +
                            "Because of the unorthodox nature of hand and body position, it is often difficult to get a lot of power behind a reverse sweep; in many situations, the intention is to glance or cut the ball to the backward leg area. However, in rare occasions, players have been able to execute reverse sweeps for a six. Kevin Pietersen, who pioneered switch hitting, is adept at this, but one could argue[original research?] that the resulting shot is basically a sweep rather than a reverse sweep. A more classic example of such a shot would be Yusuf Pathan's six off Robin Peterson. South Africa's AB de Villiers is well known for his ability to hit sixes with the reverse sweep at ease and Glenn Maxwell also often plays reverse sweep.\n" +
                            "Slog and slog sweep\n" +
                            "A slog is a powerful pull shot played over mid-wicket, usually hit in the air in an attempt to score a six. A shot would be described as a slog when it is typically played at a delivery that would not ordinarily be pulled. A slog can also be described as hitting the ball to \"cow corner\". This phrase is designed to imply that the batsman is unsophisticated in his strokeplay and technique by suggesting he would be more at home playing on more rudimentary cricket fields in which there may be cows grazing along the boundary edge. The slog can be an effective shot because all the batsman's power and body weight can be put into swinging the bat at the ball.\n" +
                            "A slog sweep is a slog played from the kneeling position used to sweep. Slog sweeps are usually directed over square-leg rather than to mid-wicket. It is almost exclusively used against reasonably full-pitched balls from slow bowlers, as only then does the batsman have time to sight the length and adopt the kneeling position required for the slog sweep. The front leg of the shot is usually placed wider outside leg stump to allow for a full swing of the bat.\n" +
                            "Upper cut\n" +
                            "An upper cut is a shot played towards third man, usually hit when the ball is pitched outside the off stump with an extra bounce. It is a dangerous shot which can edge the batsman to keeper or slips if not executed correctly. The shot is widely used in modern cricket. The shot is advantageous in fast bouncy tracks and is seen commonly in Twenty20 cricket.\n" +
                            "Switch hit\n" +
                            "A switch hit is a shot where a batsman changes his handedness and posture to adopt a stance the mirror image of his traditional handedness while the bowler is running in to bowl. As a fielding team cannot manoeuvre fielders while the bowler is in his run-up, the fielding side is effectively wrong-footed with the fielders out of position. The shot was pioneered by Kevin Pietersen, first performed off the bowling of Muttiah Muralitharan in England's 2006 home series against Sri Lanka. It was subsequently used in the New Zealand series in England in 2008 when Pietersen performed the shot twice in the same over against Scott Styris on his way to making an unbeaten century. David Warner, the Australian opening batsman, is also a frequent user of the switch hit and used it to great effect against the Indian off-spinner Ravichandran Ashwin in the first Twenty20 of the Indian cricket team's tour to Australia 2012. He is also possible to bat right-handed due to his experience in doing so in youth cricket.\n" +
                            "The legality of the switch hit was questioned when first introduced, but cleared by the International Content Council as legal. The shot is risky because a batsman is less proficient in the other handedness and is more likely to make a mistake in the execution of his shot.\n" +
                            "Scoop / ramp\n" +
                            "A scoop shot (also known as a ramp shot, paddle scoop, Marillier shot or Dilscoop) has been used by a number of first-class batsmen, the first being Dougie Marillier. It is played to short pitched straight balls that would traditionally be defended or, more aggressively, pulled to the leg side. To play a scoop shot, the batsman is on the front foot and aims to get beneath the bounce of the ball and hit it directly behind the stumps, up and over the wicket-keeper.\n" +
                            "This shot, though risky in the execution, has the advantage of being aimed at a section of the field where a fielder is rarely placed – particularly in Twenty20 and One Day International cricket where the number of outfielders is limited. However, the Marillier shot is played over the batsman's shoulder to fine leg, but the basis of the scoop stroke is for the batsman to go down on one knee to a good length or slightly short-of-length delivery off a fast or medium paced bowler and scoop the ball over the head of the wicket-keeper. The scoop shot is a risky shot to play as the improper execution of this shot may lead to a catch being offered. One famous example of the scoop backfiring is of the 2007 ICC World Twenty20 Final when Pakistan were 152/9 and needed 6 runs off 4 balls and Misbah-ul-Haq improperly executed this shot resulting in a catch to Sreesanth.\n" +
                            "A version of the scoop stroke called the Dilscoop was developed by Sri Lankan right-handed batsman Tillakaratne Dilshan during the 2009 ICC World Twenty20\n";
                }
                else if(myListView.getItemAtPosition(position).toString().trim().equals("test3")){
                    //setting value of the paragraph string
                    paragraph = "your paragraph for test3 goes here";
                }
                else if(myListView.getItemAtPosition(position).toString().trim().equals("test4")){
                    //setting value of the paragraph string
                    paragraph = "your paragraph for test4 goes here";
                }
                else if(myListView.getItemAtPosition(position).toString().trim().equals("test5")){
                    //setting value of the paragraph string
                    paragraph = "your paragraph for test5 goes here";
                }
                else if(myListView.getItemAtPosition(position).toString().trim().equals("test6")){
                    //setting value of the paragraph string
                    paragraph = "your paragraph for test6 goes here";
                }
                else if(myListView.getItemAtPosition(position).toString().trim().equals("test7")){
                    //setting value of the paragraph string
                    paragraph = "your paragraph for test7 goes here";
                }
                else if(myListView.getItemAtPosition(position).toString().trim().equals("test8")){
                    //setting value of the paragraph string
                    paragraph = "your paragraph for test8 goes here";
                }
                else if(myListView.getItemAtPosition(position).toString().trim().equals("test9")){
                    //setting value of the paragraph string
                    paragraph = "your paragraph for test9 goes here";
                }
                else if(myListView.getItemAtPosition(position).toString().trim().equals("test10")){
                    //setting value of the paragraph string
                    paragraph = "your paragraph for test10 goes here";
                }
                else {
                    //setting value of the paragraph string
                    paragraph = "no value set";
                }

                //starting the new activity and passing the paragraph to the activity using the intent
                Intent i = new Intent(Tutorial.this, DisplayActivity.class);
                i.putExtra("paragraph", paragraph);
                startActivity(i);

            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}