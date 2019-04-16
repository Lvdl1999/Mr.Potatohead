# Mr.Potatohead
## By Levy van der Linde 
## Minor Programmeren

Once someone opens the app, mr.potatoe will show up.
All the possible checkboxes are now unselected and that means the items are invisible.
The user can select one (or more) checkboxes to dress the potatoe.

The 'checkClicked' function checks which checkbox the user had selected.
In this function there is a break and default included. Break is to stop execution in the switch function. Default is to make sure the image has a value even if non of the cases is true. 

After the 'checkClicked' function, if an item was selected, it turns visible on the potatoe.
Because this is an Android app, the layout may be reloaded when leaving the app. 
To make sure it remembers which items were selected and on the potatoe, 
the 'onSaveInstanceState(Bundle outState' function was implemented. It makes sure to put all the items in a bundle.
In case someone turns the phone to landscape, the app will reload and get all data from the bundle.
If the item is on 'View.Visible' it means its get.visibility will return 'visible' and it will be shown on the reloaded version.

So to show you this app does work, here is an example with screenshots:

1. open the app

<img width="200" alt="screenshot1" src="https://user-images.githubusercontent.com/47352487/56111121-293a7080-5f57-11e9-9872-07bb258fe6a4.png">

2. select arms and ears

<img width="200" alt="screenshot2" src="https://user-images.githubusercontent.com/47352487/56111341-efb63500-5f57-11e9-984f-839f6d185caa.png">

3. deselect arms

<img width="200" alt="screenshot3" src="https://user-images.githubusercontent.com/47352487/56111381-09577c80-5f58-11e9-9de9-a8ad80d6efe4.png">

4. turn phone to landscape and remember ears were selected

<img width="340" alt="screenshot4" src="https://user-images.githubusercontent.com/47352487/56111414-2c822c00-5f58-11e9-8cb9-7f4e17b3d7c9.png">

