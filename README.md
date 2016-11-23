# WhatIs
Image recognition app taking in Camera and Gallery images and generating the first 10 tags using [Clarifai][1]'s v2 API general model.
<div align="center">
  <img src="https://github.com/RiRam/WhatIs/blob/master/screenshots/screenshot1.png" width="200px" height="356px" />
  <img src="https://github.com/RiRam/WhatIs/blob/master/screenshots/screenshot2.png" width="200px" height="356px" />
</div>

## How to install
1. Go to [developer.clarifai.com][2] and sign up your Clarifai account.
2. Create a new Clarifai application and copy the "Client ID" and "Client Secret". 
3. Open the project in Android Studio.
4. Paste CLIENT_ID and CLIENT_SECRET in the Credential.java file where it says `{insert-clientid-here}` and `{insert-clientsecret-here}`.
5. Press the Run 'app' button in the toolbar to build, install, and run the app on your android device.
Enjoy!

## List of improvements that need to be made
* UI upgrades.
* General code cleanup.
* Add ScrollView to to accomodate smaller devices (initially tested on Samsung Galaxy Note 4).
* Handle vertical images properly.

[1]: https://clarifai.com/
[2]: https://developer.clarifai.com/
