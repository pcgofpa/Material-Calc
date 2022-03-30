<h1 align="center"> Material-Calc </h1>

Capstone project to finish my Bachelor's degree in Computer Science. The idea for this project came from my friend asking me if I could make a calculator for him to make it easier for him to calculate the amount of materials required to build fences at work.

<h2 align="center"> Project Idea </h2>

This project will be created within Android Studio as a mobile application that can be installed on Android Devices and used by both contractors and do-it-yourself home improvement users. 

For contractors this application can assist with generating quotes as this application will calculate the number of posts, pickets, and runners that you will need to build your customer's fence.

<h2 align="center"> Students who created this project </h2>

<p align="center"> Project Contributions made by:
  <ol>
    <li> Ginter, Philip</li>
    <li> Kennedy, Joshua</li>
    <li> Kraffert, Nicholas</li>
    <li> Rodriguez, Shantay</li>
  </ol>
</p>

  
<h1 align="center"> Screenshots from the Emulator within Android Studio </h1>


<h2 align="center"> Home Screen </h2>
  <p align="center">
  <img width="450" src="https://user-images.githubusercontent.com/59085936/156727852-41548a2d-c4bd-4c95-b6a3-6ad5e732aa91.jpg" alt = "Home Screen">

  This home screen can have the logo of your company replace the current generic logo.
</p>

<h2 align="center">Fence Calculator Activity</h2>
<p align="center">
  <img width="450" src="https://user-images.githubusercontent.com/59085936/160943131-1693c7dd-ad77-40c4-a5e3-6f7fc3f75e7b.png" alt="Input screen for the fence calculator">
  

  This screen within the application allows the user to input up to 3 lengths. The default value is 0 with a max value of 1,000,000 ft. When the user hits calculate, the application will add the values together and carry the perimeter to the Fence Results Activity.
</p>

<h2 align="center">Fence Results Activity</h2>
<p align="center">
  <img width="450" src="https://user-images.githubusercontent.com/59085936/160943185-44fc6997-58ee-43df-a16c-dc2eb8100ed5.png" alt="Fence Results screen">
  
  <ul>
    <li>The fence results activity will display the total perimeter entered.</li>
    <li>Based off the perimeter the application will calculate the number of 4x4 posts needed</li>
    <li>Number of pickets needed</li>
    <li>Number of 2x4 runners needed</li>
    <li>Display the number of 50lb. bags of concrete needed. </li>
  </ul>  
</p>

<h2 align="center"> Flooring Material Calculator </h2>
<p align = "center">
  <img width="450" src="https://user-images.githubusercontent.com/59085936/160943230-f1b40421-df1b-4249-b12e-ba83ff3ea212.png" alt="Flooring Material Calculator">  

  Example of the Flooring Material Calculator screen. The floor material calculator calculates the area provided by the user. It then adds 10% to the area before giving the user
  a square footage to order. The extra 10% is to account for errors in cutting the materials, or sections of the material that is bad. 
</p>

<h2 align="center"> Testing </h2>
<p align = "center"> 
  <ul>
    <li>As a part of the testing process we discovered that if the user was able to input too large of a number, it would either lead to the application crashing or the app returning an exponent result. Therefore, we implemented a max value input function on all user inputs.</li>
    <li>In testing we found that the flooring calculator results were obscured on smaller screens so the location results were displayed was changed.</li>
  </ul>
