package com.example.tourism;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {

    int ltype;
    List<Place> places;
    ListView lview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        Intent i1=getIntent();
        ltype=i1.getIntExtra("Type",1);
        lview=findViewById(R.id.listview);
        ActionBar ab=getSupportActionBar();
        if(ltype==1)
        {
            initFalls();
            ab.setTitle("Falls");
        }
        else if(ltype==2)
        {
            initTemples();
            ab.setTitle("Temples");
        }
        else if(ltype==3)
        {
            initMuseums();
            ab.setTitle("Museums");
        }
       else if(ltype==4)
        {
            initHills();
            ab.setTitle("Hills");
        }
        else if(ltype==5)
        {
            initParks();
            ab.setTitle("Parks");
        }
        else
        {
            initDams();
            ab.setTitle("Dams");
        }
        MyAdapter adapter=new MyAdapter(this,places);
        lview.setAdapter(adapter);
        lview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i1= new Intent(ListActivity.this,Detail.class);
                Place p=places.get(position);
                i1.putExtra("title",p.getTitle());
                i1.putExtra("loc",p.getLoc());
                i1.putExtra("describe",p.getDescribe());
                i1.putExtra("image",p.getImage());
                i1.putExtra("rating",p.getRating());
                i1.putExtra("listype",ltype);
                startActivity(i1);
            }
        });
    }
    public void initFalls()
    {
        places=new ArrayList<>();
        Place p1=new Place();
        p1.setTitle("Hundru Falls");
        p1.setLoc(" Malghonghsa, Hundru");
        p1.setRating(4.5);
        p1.setImage(R.drawable.hundru);
        p1.setDescribe("The Hundru Falls is created on the course of the Subarnarekha River, where it falls from a height of 98 metres (322 ft) creating one of the highest water falls in the state. The spectacular scene of water falling from such a great height has been described as a sight to behold. The different formations of rock due to the erosion by the constantly falling of water have added to the beauty of the place. \n\n It is 1 h 33 min (46.3 km) away from Ranchi. \n\nBus facility is available. Route is via Ranchi- Purulia Road.\n\nLodging and Boarding facility isn't available.");
        places.add(p1);
        Place p2=new Place();
        p2.setTitle("Jonha Falls");
        p2.setRating(4.5);
        p2.setLoc("Rarhu River, Angara, Ranchi");
        p2.setImage(R.drawable.jonha);
        p2.setDescribe("Situated at an edge of the Ranchi plateau, the Jonha Falls is an example of a hanging valley falls. The Gunga River hangs over its master stream, Raru River and forms the falls. One has to descend 722 steps to admire the surroundings. Water in the falls drops from a height of 43 metres (141 ft).\n" +
                "\n" +
                "The Jonha Falls is an example of a nick point caused by rejuvenation which represents breaks in slopes in the longitudinal profile of a river caused by rejuvenation. The break in channel gradient allows water to fall vertically giving rise to a waterfall.\n\nIt is 1 h 37 min (45.2 km) away from ranchi. Route is via Khelgaon-Tatisilwai Rd and Ranchi - Purulia Rd.\n\nBus facility is available.  \n\nLodging and Boarding facility isn't available.");
        places.add(p2);
        Place p3=new Place();
        p3.setTitle("Dassam Falls");
        p3.setLoc("Ranchi District, Tarub");
        p3.setImage(R.drawable.dassam);
        p3.setRating(4.5);
        p3.setDescribe("The Dassam Falls is a natural cascade across the Kanchi River, a tributary of the Subarnarekha River. The water falls from a height of 44 metres (144 ft). The sound of water echoes all around the place. Dassam Falls at one of the edges of the Ranchi plateau is one of the many scarp falls in the region. \n \n The water of the Dassam Falls is very clean and clear. It is natural for a tourist to be enticed to enter the water for a bath or swim but tourists are warned not to do so because of the current that is generated.\n\nIt is 1 h 4 min (41.6 km) away from Ranchi. Route is via NH43.\n\nBus facility isn't available.\n\nLodging and Boarding facility isn't available.");
        places.add(p3);
        Place p4=new Place();
        p4.setTitle("Sita Falls");
        p4.setLoc("Dumargarhi (near jonha railway station)");
        p4.setImage(R.drawable.sita);
        p4.setRating(4.0);
        p4.setDescribe("Sita falls made by the course of River Kanchi is a wonderful place to visit. Sita falls is not known to many because of its location on the outskirts of a small district. But with the efforts from the tourism ministry the place is made accessible to tourists. The rocky gradient down where the water trickles, seems to have been sculpted by none other than Nature itself.\n\nIt is 1 h 31 min (45.1 km) away from Ranchi. Route is via Khelgaon-Tatisilwai Rd and Ranchi - Purulia Rd.\n\nTrains are available as it is close to Jonha Railway Station.\n\nLodging and Boarding facility isn't available.");
        places.add(p4);
        Place p5=new Place();
        p5.setTitle("Lodh Falls");
        p5.setLoc(" Latehar, Palamu");
        p5.setImage(R.drawable.lodh);
        p5.setRating(3.5);
        p5.setDescribe("It is located on the Burha River, deep in the forest of the Latehar district the Chota Nagpur Plateau. The Lodh Falls is a tiered waterfall with multiple distinct drops in a relatively close succession. It is 143 metres (469 ft) high. The thundering sound of the fall is audible even 10 km away.\n" +
                "\n" +
                "The Lodh Falls is an example of a nick point caused by rejuvenation. It is 120 km from Daltonganj, 200 km from Ranchi, and 70 km from Netarhat.\n\n4 h 58 min (194.7 km) away from Ranchi. Route is via via Ghaghra - Netarhat Rd.\n\nBus facility is available.\n\nLodging and Boarding facility isn't available.");
        places.add(p5);
        Place p6=new Place();
        p6.setTitle("Sadni Falls");
        p6.setLoc("Rajadera, Gumla");
        p6.setImage(R.drawable.sadni);
        p6.setRating(3.5);
        p6.setDescribe(" Sadni Falls (also called Sadnighagh Falls) is a waterfall located about 3 kilometres (1.9 mi) from Rajadera village in Gumla district. The 60 metres (200 ft) falls on the Sankh River is a scarp fall. It is referred to as a snake type falls and is a popular picnic spot. Its surroundings are spectacular with hillocks, forests and streams. Once upon a time, active diamond mines existed at Sadni Falls. These mines yielded many large and fine stones in the sixteenth and the seventeenth centuries.\n\nIt is 35 kilometres (22 mi) from Netarhat.\n\nBus facility is avilable.\n\nPrabhat Vihar hotel is a popular hotel. Other lodging facilities are also available.");
        places.add(p6);
        Place p7=new Place();
        p7.setTitle("Hirni Falls");
        p7.setLoc("West Singhbhum");
        p7.setRating(4.0);
        p7.setImage(R.drawable.hirni);
        p7.setDescribe("At an edge of the Ranchi plateau, around Bandgaon, the Ramgarha River plunges down 37 metres (121 ft) in a broad torrent as the Hirni Falls. Situated in a dense forest area, Hirni has been favoured by nature for scenic beauties. Hirni Falls is 20 kilometres (12 mi) from Khunti, 62 kilometres (39 mi) from Ranchi and 68 kilometres (42 mi) from Chaibasa, off Ranchi-Chaibasa Road.\n\nIt is 1 h 34 min (42.9 km) away from Ranchi. Route is via Ranchi - Purulia Rd.\n\nBus facility or Train facility isn't available.\n\nLodging and Boarding facility isn't available.");
        places.add(p7);
        Place p8=new Place();
        p8.setTitle("PanchGhagh Falls");
        p8.setLoc("Khunti district");
        p8.setRating(4.5);
        p8.setImage(R.drawable.panchghagh);
        p8.setDescribe("Panchghagh’s water does not fall from great heights. Still, one can almost hear the roar of the water when one arrives near it, because all the five branched-out and swirling streams hit the rocks in a very turbulent manner. It’s a treat to watch and hear.\n\nIn spite of the presence of a large number of high waterfalls in the area, the Panchghagh Falls are a tourists' preference for being viewed as the safest of all. The water falls from a lesser height, making it safe for tourists to enjoy in the rapid flow of water. Most of the people arrive here for picnic with family and friends.\n\nAccording to plans of the Tourism Department of the Government of Jharkhand, the Panchghagh Waterfalls will soon get a kiosk, a restaurant, toilets, fastfood joints, lighting facilities and a watchtower.\n\nPanch gagh is around 45 kms from Ranchi towards Chakradharpur Road.\n\nBus facility isn't available.\n\nThere are a lot of Lodging options available nearby.");
        places.add(p8);
    }
    public void initTemples()
    {
        places=new ArrayList<>();
        Place p1=new Place();
        p1.setTitle("Pahari mandir");
        p1.setLoc("Kumhar Toli, Ranchi");
        p1.setImage(R.drawable.pahari);
        p1.setRating(4.5);
        p1.setDescribe("The temple of Lord Shankara (Shiva) is situated in the heart of the city on a hill called Pahari Mandir. It is a bare black land outcropping in the midst of a flat land. The age old Pahari Mandir is located 8 kms from the railway station and 12 kms from the airport. The 2140 feet Ranchi hill houses the temple at its summit. One needs to climb a flight of 468 steps to reach the summit.");
        places.add(p1);
        Place p2=new Place();
        p2.setTitle("Deori mandir");
        p2.setRating(4.5);
        p2.setLoc("NH 33, Ranchi");
        p2.setImage(R.drawable.deori);
        p2.setDescribe("Deori Mandir is located in Tamar 60 km toward south from the capital of Jharkhand i.e. Ranchi. It is on the Tata-Ranchi Highway (NH33). It is a very old temple of Goddess Durga. The main attraction is that the 700 year old idol of the Goddess Durga is has 16 hands. \n\n  The temple is very old and is currently under renovation. The temple is constructed via the placing of large stones on top of each other without any cementing material.\n\nIt is 1 h 16 min (58.7 km) away from ranchi via NH43.\n\nBus facility is available.\n\nLodging facility isn't available.");
        places.add(p2);
        Place p3=new Place();
        p3.setTitle("Jagannath temple");
        p3.setRating(4.0);
        p3.setLoc("Jagannathpur Chowk Khataal, Sector 1, Ranchi");
        p3.setImage(R.drawable.jagannmath);
        p3.setDescribe("Jagannath Temple in Ranchi was built by king of Barkagarh Jagannathpur Thakur Ani Nath Shahdeo, during 1691. Completed on Christmas 1691, it is located about 10 km from the main town. The temple is on top of a small hillock. \n\n The temple has been built on a hill top. To reach the top visitors can climb the stairs or take the vehicle route. ");
        places.add(p3);
        Place p4=new Place();
        p4.setTitle("Sun temple");
        p4.setLoc("Bundu,Ranchi");
        p4.setRating(4.0);
        p4.setImage(R.drawable.sun);
        p4.setDescribe("About 39 km. from Ranchi on Tata Road near Bundu, stands the elegant Sun Temple fashioned in the form of huge chariot with richly decorated 18 wheels (nine on each side) and seven life like horses ready to take off.\n\n Built by Sanskriti Vihar headed by Shri Sita Ram Maroo, the Managing Director of Ranchi Express Group, the Sun Temple deserves the title 'a poem in stone'. \n\nThe surroundings of the temple, studded with a pond serving as a sacred place for Chhathavratis are actually a natures bounty to the people of Chhotanagpur. A beautiful dharmashala, meant for the pilgrims and the tourists is under construction.\n\nit is 52 min (38.2 km) away from Ranchi via NH43.\n\nBus facility is available.\n\nLodging facility is available.");
        places.add(p4);
        Place p5=new Place();
        p5.setTitle("Chhinnamasta  temple");
        p5.setLoc(" Rajrappa Road, Rajrappa");
        p5.setRating(4.5);
        p5.setImage(R.drawable.rajrappa);
        p5.setDescribe("The temple enshrines the Goddess Chinnamasta (the beheaded Goddess Kali), one of the ten forms of the Goddess Durga. The statue shows the goddess holding her own head in her left hand and her head drinking the blood oozing out of her neck. \n\nThe headless idol of Goddess Chhinnamastika stands on the body of Kamdeo and Rati in Lotus bed. Many smaller temples have been built around the main temple such as the temples of Ashtamatrika and Dakshina Kali. The temples of Mahavidyas built in a series nearby are Tara, Shodashi, Bhubneswari, Bhairavi, Bagla, Kamla, Matangi, Dhumavati.\n\nIn the month of January a special fair is held here on the festival of Makar Sankranti and attended by lakhs of people. A fair is also organized during the festival of Vijaydashmi, Vijayadashami and attended by large number of people. Visitors can take a holy bath in the river.\n\nIt is 2 h 2 min (79.8 km)away from Ranchi. Route is via Kanke - Ormanjhi Rd and NH20.\n\nBus facility is available.\n\nLodging facility is available.");
        places.add(p5);
        Place p6=new Place();
        p6.setTitle("Sai  temple");
        p6.setLoc("Christanpara, Sonari, Jamshedpur");
        p6.setImage(R.drawable.sai);
        p6.setRating(4.0);
        p6.setDescribe("The Sri Sai Centre, built on 0.75 acre at a cost of around Rs 3 crore, is meant for all devotees of Shirdi Sai Baba, the legendary saint held as the incarnation of Krishna by some and a pir by others.\n\nTrue to the spirit of Sai Baba, the centre is open to all. This is not only a temple but also spiritual retreat, essential for cosmopolitan Jamshedpur.\n\nThe design of the main building has 60ft arches. The roof above Sai Baba’s idol is of glass to let in sunlight. There is a meditating hub, lecture halls, administrative blocks, landscaped garden and parking area. ");
        places.add(p6);
        Place p7=new Place();
        p7.setTitle("RamaKrishna Mission");
        p7.setLoc("Morabadi, Ranchi");
        p7.setRating(4.5);
        p7.setImage(R.drawable.mission);
        p7.setDescribe("The vision of Swami Vivekananda took shape with the establishment of this Ashrama at Ranchi in 1927. This Ashrama was founded by Srimat Swami Vishuddhanandaji Maharaj the eights President of Ramakrishna Order. \n\nThis Ashrama has been sanctified by the visits of Swami Subodhananda, another direct disciple of Sri Ramakrishna and the holy presence of its founder Swami Vishuddhananda. \n\nIn the year 1969 Divyayan a residential institute for training village youths, particularly tribals, in scientific agriculture, horticulture, dairy, poultry, bee-keeping, farm machinery etc. and social service came in.");
        places.add(p7);
    }
    public void initMuseums()
    {
        places=new ArrayList<>();
        Place p1=new Place();
        p1.setTitle("Science centre");
        p1.setLoc("Tagore Hill Road, Near, Temple Rd, Chiraundi, Morabadi, Ranchi");
        p1.setImage(R.drawable.science_centre);
        p1.setRating(4.5);
        p1.setDescribe("Ranchi Science Centre is the first science centre in the state of Jharkhand .In 8 acre area, there are several interactive exhibits on simple machines, sound, optics, pendulum and static models of prehistoric animals. The centre comprises two storied building that houses three permanent thematic galleries of covered area 42,000 square meter on an area of 13 acre land, provided by Government of Jharkhand.");
        places.add(p1);
        Place p2=new Place();
        p2.setTitle("Coin museum");
        p2.setLoc("G-4/138, Straight Mile Road, Sakchi, Jamshedpur");
        p2.setImage(R.drawable.coin);
        p2.setRating(3.5);
        p2.setDescribe("The Jamshedpur Coin Museum is one such museum that is unique throughout the county. Historic coins of ancient India and ancient world are displayed in this museum. Each of these displayed coins in the showcases have respective descriptions mentioned about the displayed coin. It is a famous tourist attraction for its uniqueness and originality. ");
        places.add(p2);
        Place p3=new Place();
        p3.setTitle("State museum");
        p3.setLoc("Hotwar Khelgaon Mega Sports Complex, Ranchi");
        p3.setRating(4.0);
        p3.setImage(R.drawable.state);
        p3.setDescribe("The museum was built to express the cultural heritage of Jharkhand. It has several galleries, and contains paintings by artists from many states such as Bengal, Orissa, and Bihar. The museum has a library that is well-equipped library and can house up to 300 people.\n\nIt is 36 min (11.8 km) away from Ranchi. Route is via Old Hazaribagh Rd/Paramahansa Yogananda Path.\n\nBuses are available sufficiently.\n\nPlenty of hotels are available nearby.");
        places.add(p3);
        Place p4=new Place();
        p4.setTitle("Sanskriti Museum and Art Gallery");
        p4.setLoc("Dipugarha, Hazaribagh");
        p4.setRating(4.0);
        p4.setImage(R.drawable.sanskriti);
        p4.setDescribe("The Sanskriti museum displays a collection of Palaeolithic to neolithic stone tools, microliths, and bronze to Iron Age artifacts, including potteries and Buddhist antiquities from around the Hazaribagh region.\n\nIt has a gallery dedicated to the Birhors, Santhals, and Oraons along with monographs complied on their Life, Folklore, Songs, Ethnobotany are available in the museum research archives, and library. It also has a gallery of local crafts and textile, and an art gallery over about 200 Khovar (marriage art) and Sohrai (harvest art) paintings of Hazaribagh exhibited and displayed.\n\nIt is 2 h 28 min (98.4 km) away from Ranchi via NH20.\n\nBuses and  trains are available.\n\nLodging facility is great in hazaribagh.");
        places.add(p4);
        Place p5=new Place();
        p5.setTitle("Tribal Museum");
        p5.setLoc("Sisai Road, Gumla");
        p5.setRating(3.5);
        p5.setImage(R.drawable.tribal);
        p5.setDescribe("An attraction gaining popularity amongst tourists, Jharkhand Tribal Museum, Arouse, Sisai Road, Gumla, Gumla is now making it to the list of every traveler. the tribes described in the museum are the Birhor Tribe, the Munda Tribe, the Birja Tribe, the Lohra Tribe, the Korawa Tribe and the Asur Tribe.\n\nIt is 2 h 11 min (91.3 km) away from Ranchi via NH43.\n\nBoth buses and trains are available.\n\nLodging facility is available.");
        places.add(p5);
    }
    public void initHills()
    {
        places=new ArrayList<>();
        Place p1=new Place();
        p1.setTitle("Tagore hill");
        p1.setRating(4.5);
        p1.setLoc("Van Vrindavan Colony, Morabadi, Ranchi");
        p1.setImage(R.drawable.tagore);
        p1.setDescribe("Tagore Hill is situated at an altitude of 200 feet in an isolated location where one find spend time in some peace and quiet. It is named after the famous poet, Nobel Laureate Rabindra Nath Tagore.\n" +
                "\n" +
                "It is known that he used to come here to write and the found the serene atmosphere at the top of the hill inspiring for his creativity. A centre of Divayan and Agararian Vocational Institute and a Ramakrishna Mission Ashram is situated at the foot of Tagore Hill.");
        places.add(p1);
        Place p2=new Place();
        p2.setTitle("Netarhat hills");
        p2.setRating(4.5);
        p2.setLoc("Latehar district");
        p2.setImage(R.drawable.netarhat);
        p2.setDescribe("Falling in the Latehar district of Jharkhand, Netarhat is popularly known as the Queen of Chotanagpur. It is best known for the sunrise and sunset views it offers.\n\n Standing so close to nature, in that backdrop, all you need to do is take a few deep breathes and you'd just start feeling, life's good.\n\nIt is 3 h 59 min (153.1 km) away from Ranchi. Route is via Lohardaga Rd and Ghaghra - Netarhat Rd.\n\nBuses and Trains are available till Netarhat.\n\nLodging facilities are available.");
        places.add(p2);
        Place p3=new Place();
        p3.setTitle("Trikut Hills");
        p3.setRating(4.0);
        p3.setLoc("Tiurpahar (near Dumka)");
        p3.setImage(R.drawable.trikut);
        p3.setDescribe("There are three main peaks on the hill. The height of this hill is approximately 2470 feet. The rope way is most famous here it can be used to reach the top of the hill. \n\n The hill is covered by clouds in rainy seasons and waterfalls and small streams can be seen from July–September. The view from top of mountain is stunning and solar panels situated in Topovan (First solar energy hub in Jharkhand)\n\nIt is 6 h 42 min (266.0 km) away from Ranchi via NH114A.\n\nBuses and trains are available till dumka.Furthur, local buses are available\n\nLodging facility isn't available.");
        places.add(p3);
        Place p4=new Place();
        p4.setTitle("Dalma Hills");
        p4.setRating(3.5);
        p4.setLoc("Kaira, Jamshedpur");
        p4.setImage(R.drawable.dalma);
        p4.setDescribe("Located at the distance of 13 kms from the main city of Jamshedpur, Dalma hill is the famous tourist hotspot lies in Jharkhand. The exotic ranges of Dalma hill is situated at a height of 3000 feet above sea level. The destination is known for rich forest reserve, Asiatic elephants and a wildlife sanctuary. There is Subarnarekha River that swiftly flows through the Dalma Hills.\n\nIt is 1 h 40min (36.8 km) away from Jamshedpur via NH18.\n\nBus facility isn't available.\n\nGuest houses are available.");
        places.add(p4);
        Place p5=new Place();
        p5.setTitle("Rajmahal Hills");
        p5.setRating(3.5);
        p5.setLoc("Santhal Pargana division");
        p5.setImage(R.drawable.rajmahal);
        p5.setDescribe("According to geologists, the Rajmahal hills have been formed from rocks dating from the Jurassic Period. The formations of these hills are the result of volcanic activity in the Jurassic.\n\nThe hills are located in the Jharkhand state of India. They are pointed in a north-south axis with an average elevation of 200-300 meters (600-1000 feet) above mean sea level. It starts from Sahibganj district and ends up in Dumka district. The River Ganges wanders around the hills changing the direction of flow from east direction to south direction. The hills span over an area of 120 miles and are located between 25 degree North latitude and 87 degree East longitude. \n\nIt is 316 kms away from Ranchi.\n\nTrains are avilable from Ranchi.\n\nLodging and boarding facilities are unavailable.");
        places.add(p5);
    }
    public void initParks()
    {
        places=new ArrayList<>();
        Place p1=new Place();
        p1.setTitle("Nakshatra Van");
        p1.setRating(4.0);
        p1.setLoc("Rajbhawan Road, Ranchi");
        p1.setImage(R.drawable.nakshatra);
        p1.setDescribe("This park comprises of various Nakshatras, each of which is associated with a Zodiac sign and celestial bodies. According to Hindu astrologers, each constellation is associated with a tree that is of medicinal, aesthetic, social and economic value.\n\n The centre of this circle also has a musical fountain with a huge pot collecting all its water. It also has various species of flowers planted along its pathway. Its centre also has a sleeping statue of Dhanvantari." );
        places.add(p1);
        Place p2=new Place();
        p2.setTitle("Jubilee Park");
        p2.setRating(4.0);
        p2.setLoc("Sakchi, Jamshedpur");
        p2.setImage(R.drawable.jublee);
        p2.setDescribe("This park was originally a gift, to the town of Tatanagar(Jamshedpur) from the Tata Steel Company. While being built under the visionary Jamsetji Tata, the Vrindavan gardens in Mysore were used as an inspiration.\n\n This park also shows off a status of Jamsetji Tata and is also known as the Mughal Gardens of Jamshedpur. The presence of the Tata Steel Zoological Park, Nicco Jubilee Amusement Park, Jayanti Sarovar(Zoo Lake), Bat Island, Children's Park, and Rose Garden is part of the reason why this park is such a famous one.");
        places.add(p2);
        Place p3=new Place();
        p3.setTitle("Barmasia Park");
        p3.setLoc("Panchwati, Dhanbad");
        p3.setRating(4.5);
        p3.setImage(R.drawable.barmasia);
        p3.setDescribe("The 'Barmasia Park' is a family park in Panchwati, Dhanbad. The major point of attraction here, are the grass sculptures present here. This park carries many rare for a view kind of grass sculptures it includes horses, snakes, rats, etc. Other than this equipped portion of the park it is also having an open area or grass ground which has made this place an ideal destination as a picnic spot.");
        places.add(p3);
        Place p4=new Place();
        p4.setTitle("Rock Garden");
        p4.setRating(4.5);
        p4.setLoc("Gandhi Nagar, Ranchi");
        p4.setImage(R.drawable.rock);
        p4.setDescribe("Rock Garden in Ranchi is considered to be one of the most visited places of the city as well as the state.\n" +
                "\n" +
                "The famous Rock Garden in Ranchi is located at a distance of around 4 kilometers from the Albert Akka Chowk. The Ranchi Rock Garden stands second in importance and fame after the garden of Jaipur. The Rock Garden in Ranchi was built out of the rocks of the Gonda Hill. There is a jhula made of iron rod with two edges in this rock garden located in the capital city of Jharkhand. The varied forms of sculptures and waterfalls add to the beauty of this place.\n\n The Rock Garden is also used as a picnic spot, where large groups of people can spend quality time together.");
        places.add(p4);
        Place p5=new Place();
        p5.setTitle("Fun Castle");
        p5.setRating(4.0);
        p5.setLoc("Ratu Basti, Ranchi");
        p5.setImage(R.drawable.fun);
        p5.setDescribe("Fun Castle is an Amusement Park meant to cater all age groups. There is something here for everyone. it is a simple amusement park with go-karts, boating, various kids' rides & a small cafe.There is also an automatic cricket ball machine.");
        places.add(p5);
        Place p6=new Place();
        p6.setTitle("Sidhu Kanhu Park");
        p6.setLoc(" Morabadi, Ranchi");
        p6.setRating(4.0);
        p6.setImage(R.drawable.sidhu);
        p6.setDescribe("The park made in the memory of freedom fighters — Sido and Kanhu. During summer season both children and elders look to spent time in park. The main attractions of the park are flowers, garden, artificial water fall, bridge, statues of Bhagwan Birsa Munda and Sidhu Kanhu brothers, boating in water tank, grass lawns and trains for children. The park is being run by Jharkhand Forest Development Corporation ltd.");
        places.add(p6);
        Place p7=new Place();
        p7.setTitle("Bhagwan Birsa Biological Park");
        p7.setLoc(" NH33, Ormanjhi");
        p7.setRating(5.0);
        p7.setImage(R.drawable.ranchi_zoo);
        p7.setDescribe("The Birsa Zoological Park, also known as Birsa Jaivik Udyan houses a wide variety of wild animals . It is located on the Ranchi-Patna National Highway near Ormanjhi and is a must-visit for all wildlife enthusiasts.\n" +
                "\n" +
                "The Park houses in captivity the wild animals of various species, such as Tiger, Lion, Leopard, Leopard Cat, Jungle Cat, Hyaena, Sloth Bear, Himalayan Black Bear, Jackal, Fox, Indian One-horned Rhinoceros, Langur, Monkey, Porcupine, Nilgai, Cheetal, Sambhar, Barking Deer, Black Buck etc. and birds like Grey Pelican, Peafowl, Black Ibis, Kite etc. and reptiles like Gharial and Marsh Crocodile in naturalistic enclosures, all within the overall natural sylvan ambience which itself holds free-ranging wild animals like Jungle Cat, Jackal, Fox, Hare, a variety of ground as well as flying birds and snakes.\n\nIt is 1 h (26.1 km) away from Ranchi via NH20.\n\nAmple of buses are available.\n\nLodging and boarding facility is great over here.");
        places.add(p7);
        Place p8=new Place();
        p8.setTitle("Tata Steel Zoological Park");
        p8.setLoc("Sakchi, Jamshedpur");
        p8.setImage(R.drawable.tata_zoo);
        p8.setRating(4.5);
        p8.setDescribe("Tata Steel Zoological Park is situated in the corner most area of Jubilee Park. This zoo is known for its Safari Park, which enables tourists to drive through the wooded area, where animals roam freely. Tourists can also visit the Nature Education Centre in the zoo, which gives information about the zoo animals. Other things to do in this zoo are to take a boat ride in the Jubilee Lake and walk along the nature Trail.");
        places.add(p8);
    }
    public void initDams()
    {
        places=new ArrayList<>();
        Place p1=new Place();
        p1.setTitle("Rukka dam");
        p1.setRating(4.5);
        p1.setLoc("Ormanjhi, Ranchi");
        p1.setImage(R.drawable.rukka);
        p1.setDescribe("Getalsud or Rukka Dam is an artificial reservoir situated in Ormanjhi, Ranchi, Jharkhand. It was constructed across the Subarnarekha River and was opened in 1971. It is a popular picnic spot for the residents of Ranchi and Ramgarh District. The dam provides a small-scale fishing opportunity to the local people of Rukka. The main purpose of the dam is to fulfill the drinking water requirements of the residents of Ranchi.\n\nIt is 1 h 1 min (24.9 km) awayu from Ranchi via NH20.\n\nBuses aren't available.\n\nLodging facilities are available.");
        places.add(p1);
        Place p2=new Place();
        p2.setTitle("Kanke dam");
        p2.setLoc("Kanke, Ranchi");
        p2.setImage(R.drawable.kanke);
        p2.setRating(4.5);
        p2.setDescribe("Offsetting the huge, dark boulders of the Gonda hills, lies the huge reservoir of the Kanke Dam. This lake is great for fishing and makes a perfect picnic spot. You may climb down the steps leading to the water and take a walk around the lake. You'll find numerous water hyacinths floating on the lake's rim. The sunset view from this place is very magical that should not be missed.");
        places.add(p2);
        Place p3=new Place();
        p3.setTitle("Patratu dam");
        p3.setLoc("Kanke-Patratu road, Ramgarh district, Ranchi");
        p3.setImage(R.drawable.patratu);
        p3.setRating(4.5);
        p3.setDescribe("Patratu Dam was constructed under the planning of the father of Indian engineering, Sir Mokshagundam Visvesvaraya. This dam is only 40 km away from Ranchi.\n\n The Panchawahini temple adjacent to the dam is an ancient temple and significant for its religious value. This dam is also known as Nalkarni dam which presents beautiful scenes owing to its beautiful sceneries and serpentine ways made on the hills which borders the dam from 3 sides.\n\nIt is 1 h 19 min (41.9 km) away from Ranchi. Route is via Kanke Patratu Rd/Ranchi Patratu Ramgarh Rd.\n\nDirect travelling facility isn't available.\n\nHotels are plentily available.");
        places.add(p3);
        Place p4=new Place();
        p4.setTitle("Khandoli dam");
        p4.setRating(3.5);
        p4.setLoc("Giridih (near Bengabad)");
        p4.setImage(R.drawable.khandoli);
        p4.setDescribe("Khandoli has been developed as a tourism attraction by district tourism department. The number of tourists increase in the winter months for bird-watching due to the presence of migratory birds in the area. \n\nAn amusement park spread over 6 acres (2.4 ha) is built near the lake which offers joy rides in toy train and swings. Elephant and camel safaris and numbers of other amusement facilities are available. A canteen is available for convenience of the tourists. A watch tower and 600 feet high hillock offers a panoramic view of Khandoli site.\n\nIt is 1 h 57 min (77.2 km) away from Dhanbad. Route is via Kodarma - Giridih - Tundi - Gobindpur Rd.\n\nBuses aren't available.\n\nLodging facilities are available in nearby location.");
        places.add(p4);
        Place p5=new Place();
        p5.setTitle("Konar dam");
        p5.setLoc(" Hazaribagh District");
        p5.setRating(3.5);
        p5.setImage(R.drawable.konar);
        p5.setDescribe("Konar dam is the second of the four multi-purpose dams included in the first phase of the Damodar Valley Corporation. It was constructed across the Konar River, a tributary of the Damodar River in Hazaribagh district  and opened in 1955.\n\n The place has scenic beauty and has been developed as a recreational spot. Konar Dam is 4,535 metres (14,879 ft) long and 48.77 metres (160.0 ft) high. The reservoir covers an area of 27.92 sq. km.\n\nIt is 2 h 18 min (86.0 km) away from Bokaro via NH320.\n\nLocal buses are available.\n\nLodging facility isn't available.");
        places.add(p5);
        Place p6=new Place();
        p6.setTitle("Tenughat dam");
        p6.setRating(4.0);
        p6.setLoc("Petarwar, Bokaro");
        p6.setImage(R.drawable.tenughat);
        p6.setDescribe("The 5 kilometres (3.1 mi) long, 55 metres (180 ft) high earthfill dam with composite masonry cum concrete spillway and undersluice structures, concrete diaphragm cut-off wall, rock excavation in foundation, diversion channel, coffer dam and appurtenant works at Tenughat was built for supply of water to Bokaro Steel Plant and the Bokaro industrial area.\n\nUnion tourism ministry's proposal to boost tourism in each district, Bokaro district has zeroed in on the Tenughat dam area to be developed into a tourist centre.\n\nIt is 2 h 18 min (86.0 km) away from Bokaro via NH320.\n\nVolvo buses are available.\n\nAmple hotels are available for stay.");
        places.add(p6);
        Place p7=new Place();
        p7.setTitle("Panchet dam");
        p7.setRating(3.5);
        p7.setLoc("Panchet, Dhanbad");
        p7.setImage(R.drawable.panchet);
        p7.setDescribe("Panchet dam is built across the Damodar River in Dhanbad District’s Panchet area in Jharkhand. Inaugurated in 1959, Panchet dam is the fourth of the 4 multi-purpose dams that fall under the first phase of Damodar Valley Corporation.\n\nThe ideal time to visit this reservoir is at the end of the monsoon, when the water level of the tank is high and the gates of the dam are unlocked to let the water out, or at the starting of the winter.\n\nIt is 1 h 17 min (52.3 km) away from Dhanbad. Route is via GT Rd.\n\nBus service is available.\n\nLodging and boarding facilities are nearby available.");
        places.add(p7);
    }
}
