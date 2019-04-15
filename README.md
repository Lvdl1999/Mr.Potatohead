# Mr.Potatohead
## By Levy van der Linde 
## Minor Programmeren

Once someone opens the app, the potatoe will show.
All the possible checkboxes are now unselected and that means the items are invisible.
The user can select one (or more) checkboxes to dress the potatoe.

The 'checkClicked' function checks which checkbox the user had selected.
In this function there is a break and default included. Break is to stop execution in the switcht.
Default is to make sure the image has a value even if non of the cases is true. 

After the 'checkClicked' function, if an item was selected, it turns visible on the potatoe.
Because this is an Android app, the layout may be reloaded when leaving the app. 
To make sure it rememberd which items were selected and on the potatoe, 
the 'onSaveInstanceState(Bundle outState' function was implemented. It makes sure to put all the items in a bundle.
In case someone turns the phone to landscape, the app will reload and get all data from the bundle.
If the item is on 'View.Visible' it means its get.visibility will return 'visible' and it will be shown on the reloaded version.

So to show you this app does work, here is an example with screenshots:

1. open the app

src="https://user-images.githubusercontent.com/47352487/56110787-03609c00-5f56-11e9-97d6-c304cb76fd2d.png">

https://github.com/Lvdl1999/Mr.Potatohead/issues/2

2. select arms and ears

3. deselect arms

4. turn phone to landscape and remember ears were selected
