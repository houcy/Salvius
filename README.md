# Open Source Humanoid Robot

####Salvius is an open source humanoid robot. For additional details visit: [http://salviusrobot.blogspot.com](http://salviusrobot.blogspot.com)

The main idea that I am attempting to promote is onboard expirimental development. My goal is to create this software
so that I, and anyone else who needs it can develop and make changes to a robot's programming rapidly, and without
having to plug in via a tethered connection. My web interface also is designed to contain many usefull control, and
diagnostic tools.

## Server Setup:
I don't always set up servers but when I do, I choose Ubuntu.
* Install or use a copy of Ubuntu Server edition. It is also helpful to install OpenSSH at the same time.
* On the server it is helpfull to install OpenSSH, git, and nginx.
* Configureing nginx is wicked easy, just edit etc/nginx/nginx.conf

```

```

Install the robots web ui by cloning this git repository.
```
cd usr/share/nginx/www/
git clone https://github.com/gunthercox/Salvius.git
```

After you make changes to files on the server you should restart nginx.
```
sudo service nginx restart
```

* The files in the gui directory go on the robot's server.
* The java file in the interaction directory gets compiled as a jar and runs on the robots computer.
* The Arduino sketch in the arduino directory gets uploaded to the Arduino board.

## Arduino Setup:
* Plug Ethernet shield into Arduino Uno.
* Plug Seeed Relay Shield into Ethernet Shield.
* Attach 9 volt power supply to GND and +9V plugs of Relay Shield.
* PIR positive(+) to arduino 5V, PIR negative(-) to arduino GND, PIR OUT to HUB2 D3.
* Connect Ethernet shield to wireless router with Ethernet cable.

## Development:
~~I have recently added the rxtx-2.1-7r2 library written mostly in java to this repository. The rxtx-2.1-7r2 library is
the same one that is used in the Arduino IDE to allow the computer to communicate with the Arduino board through the
serial port. I hope to use this library to allow a developer to access and make modifications to the microcontroller's
code directly from the web interface on the robot's server.~~

I am currently working on implementing AJSON to interact with the arduino boards via api. This will be much simpler and
more efficient than using the java library.

### Tools and libraries included in this project
* [angularjs](http://angularjs.org)
* [Foundation UI](http://foundation.zurb.com)
* [OneGate](https://github.com/liftoff/GateOne)

#### Packages
* [nginx](http://wiki.nginx.org)
* [nodejs](http://nodejs.org)
* [component](https://github.com/component/component)

You can install all required packages for this project by running the following
```
sudo apt-get install nginx nodejs npm
sudo npm install -g component
```


## License:
@author: Gunther Cox
@website: http://salviusrobot.blogspot.com

This project has been made possible with funding from the following businesses and individuals:
Jennifer Cox, Adam Iredale, Janet Wise, Glen Zenor, Boris Hofer, Señora Alderperson, Wilbraham Music (Chris Cox), June Cox, Rantz

This work is licenced under Attribution-ShareAlike 3.0 Unported (CC BY-SA 3.0). Under this licence you are free to to Share, to copy, distribute and transmit the work
to Remix to adapt the work, to make commercial use of the work under the following conditions.

You must attribute this work as depicted in the copyright attribution of the code's comments but you may (but not in any way that suggests any endorsement of you or your use of the work.

If you alter, transform, or build upon this work, you may distribute the resulting work only under the same or similar license to this one.

Understand that any of the above conditions can be waived if you get permission from the copyright holder.

Where the work or any of its elements is in the public domain under applicable law, that status is in no way affected by the license.

In no way are any of the following rights affected by the license: Your fair dealing or fair use rights, or other applicable copyright exceptions and limitations; The author's moral rights; Rights other persons may have either in the work itself or in how the work is used, such as publicity or privacy rights.

Notice: For any reuse or distribution, you must not remove the attribution from these works.
