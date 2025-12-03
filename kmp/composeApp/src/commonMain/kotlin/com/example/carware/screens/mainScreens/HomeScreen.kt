package com.example.carware.screens.mainScreens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import carware.composeapp.generated.resources.Res
import carware.composeapp.generated.resources.poppins_medium
import carware.composeapp.generated.resources.poppins_semibold
import com.example.carware.m
import org.jetbrains.compose.resources.Font
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.jetbrains.compose.resources.ExperimentalResourceApi
import carware.composeapp.generated.resources.upline
import carware.composeapp.generated.resources.person
import carware.composeapp.generated.resources.dots
import carware.composeapp.generated.resources.audi
import carware.composeapp.generated.resources.car
import carware.composeapp.generated.resources.color
import carware.composeapp.generated.resources.modelyear
import carware.composeapp.generated.resources.cuate
import carware.composeapp.generated.resources.arrow_1
import com.example.carware.screens.appButtonBack
import com.example.carware.screens.appGradBack
import com.example.carware.screens.cardGradBack


@Composable
fun HomeScreen(navController: NavController) {
    val popSemi = FontFamily(Font(Res.font.poppins_semibold))
    val popMid = FontFamily(Font(Res.font.poppins_medium))
    val scrollState = rememberScrollState()

    Column(
        m
            .fillMaxSize()
            .appGradBack()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 35.dp, vertical = 32.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    painter = painterResource(Res.drawable.person),
                    contentDescription = null,
                    tint = Color.Unspecified,
                    modifier = m.size(25.dp)
                ) //profile icon
                Spacer(modifier = m.padding(horizontal = 4.dp))
                Text(
                    "Welcome Back \n username",
                    fontFamily = popSemi,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(217, 217, 217, 255)
                ) // welcome back
            }
            Spacer(modifier = m.padding(horizontal = 8.dp))

            Icon(
                painter = painterResource(Res.drawable.person),
                contentDescription = null,
                tint = Color.Unspecified,
                modifier = m
                    .size(25.dp)

            ) //notifications

        }
    }
}


//{
//
//
//    @OptIn(ExperimentalResourceApi::class)
//    val popSemi = FontFamily(Font(Res.font.poppins_semibold))
//
//    val popMid = FontFamily(Font(Res.font.poppins_medium))
//
//    val scrollState = rememberScrollState()
//
//
//    Box(
//        modifier = m
//            .fillMaxSize()
//            .appGradBack()
//
//
//    ) {
//
//        Icon(
//            painter = painterResource(Res.drawable.upline),
//            contentDescription = null,
//            tint = Color(230, 230, 230, 255),
//            modifier = m
//                .scale(2.5f)
//                .absoluteOffset(x = 40.dp, y = 7.dp),
//        ) //line
//        Row(
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(horizontal = 35.dp, vertical = 32.dp),
//            horizontalArrangement = Arrangement.SpaceBetween,
//            verticalAlignment = Alignment.CenterVertically
//        ) {
//            Row(verticalAlignment = Alignment.CenterVertically) {
//                Icon(
//                    painter = painterResource(Res.drawable.person),
//                    contentDescription = null,
//                    tint = Color.Unspecified,
//                    modifier = m.size(25.dp)
//                ) //profile icon
//                Spacer(modifier = m.padding(horizontal = 4.dp))
//                Text(
//                    "Welcome Back \n username",
//                    fontFamily = popSemi,
//                    fontSize = 16.sp,
//                    fontWeight = FontWeight.Bold,
//                    color = Color(217, 217, 217, 255)
//                ) // welcome back
//            }
//            Spacer(modifier = m.padding(horizontal = 8.dp))
//            Icon(
//                painter = painterResource(Res.drawable.person),
//                contentDescription = null,
//                tint = Color.Unspecified,
//                modifier = m
//                    .size(25.dp)
//
//            ) //notifications
//
//        }
//
//        Column(
//            modifier = Modifier
//                .fillMaxWidth() // Must fill width
//                .fillMaxHeight() // Fill the available space (the box)
//                .absoluteOffset(y = 105.dp) // Offset it from the top
//                .clip(RoundedCornerShape(70.dp, 70.dp, 0.dp, 0.dp))
//                .verticalScroll(scrollState) // <-- This now works on the remaining space
//                .background(Color(217, 217, 217, 255)),
//            horizontalAlignment = Alignment.CenterHorizontally
//        ) {
//            Spacer(modifier = m.padding(vertical = 18.dp))
//            Column(horizontalAlignment = Alignment.CenterHorizontally) {
//                Box {
//                    Card(
//                        colors = CardDefaults.cardColors(containerColor = Color(0x39000000)),
//                        modifier = m
//                            .size(width = 320.dp, height = 240.dp)
//                            //                        .offset(x = 4.dp, y = 8.dp) // move the shadow
//                            .shadow(
//                                elevation = 10.dp,
//                                shape = RoundedCornerShape(15.dp),
//                                clip = false
//                            ),
//                        shape = RoundedCornerShape(15.dp),
//
//
//                        ) { }//shadow
//                    Card(
//                        colors = CardDefaults.cardColors(containerColor = Color.Transparent),
//                        modifier = m
//                            .size(width = 320.dp, height = 240.dp)
//                            .clip(shape = RoundedCornerShape(15.dp))
//                            .cardGradBack(),
//                    ) {
//                        Column(
//                            modifier = m.fillMaxSize()
//                                .padding(top = 20.dp, bottom = 10.dp),
//                            horizontalAlignment = Alignment.CenterHorizontally
//
//                        ) {
//                            Row(
//                                modifier = m
//                                    .fillMaxWidth()
//                                    .padding(horizontal = 20.dp),
//                                horizontalArrangement = Arrangement.End
//                            ) {
//                                Icon(
//                                    painter = painterResource(Res.drawable.dots),
//                                    contentDescription = null,
//                                    tint = Color.Unspecified,
//                                    modifier = m
//                                        .size(20.dp)
//
//                                )
//                            } // top dots
//                            Image(
//                                painter = painterResource(Res.drawable.audi),
//                                contentDescription = null,
//                                modifier = m
//                                    .size(230.dp, 160.dp)
//
//                            ) //car image
//                            Row(
//                                modifier = m
//                                    .fillMaxWidth()
//                                    .padding(horizontal = 20.dp),
//                                horizontalArrangement = Arrangement.Start
//                            ) {
//                                Text(
//                                    "Audi",
//                                    fontFamily = popSemi,
//                                    fontSize = 24.sp,
//                                    fontWeight = FontWeight.Bold,
//                                    color = Color(102, 102, 102, 255)
//                                )
//                            } //car brand
//                            Spacer(modifier = m.padding(vertical = 4.dp))
//                            Row(
//                                modifier = m
//                                    .fillMaxWidth(),
//                                //                                .padding(horizontal = 20.dp),
//                                horizontalArrangement = Arrangement.SpaceEvenly,
//                                verticalAlignment = Alignment.CenterVertically
//                            ) {
//                                Row(
//                                    verticalAlignment = Alignment.CenterVertically
//
//                                ) {
//                                    Icon(
//                                        painter = painterResource(Res.drawable.car),
//                                        contentDescription = null,
//                                        tint = Color.Unspecified,
//                                        modifier = m
//                                            .size(22.dp)
//
//                                    )
//                                    Spacer(modifier = m.padding(horizontal = 2.dp))
//
//                                    Text(
//                                        "A6",
//                                        fontFamily = popSemi,
//                                        fontSize = 14.sp,
//                                        color = Color(102, 102, 102, 255)
//                                    )
//
//                                }
//                                Spacer(modifier = m.padding(horizontal = 8.dp))
//
//                                Row(
//                                    modifier = m
//                                ) {
//                                    Icon(
//                                        painter = painterResource(Res.drawable.modelyear),
//                                        contentDescription = null,
//                                        tint = Color.Unspecified,
//                                        modifier = m
//                                            .size(22.dp)
//
//                                    )
//                                    Spacer(modifier = m.padding(horizontal = 2.dp))
//
//                                    Text(
//                                        "2024",
//                                        fontFamily = popSemi,
//                                        fontSize = 14.sp,
//                                        color = Color(102, 102, 102, 255)
//                                    )
//
//                                }
//                                Spacer(modifier = m.padding(horizontal = 8.dp))
//
//                                Row(
//                                    modifier = m
//                                ) {
//                                    Icon(
//                                        painter = painterResource(Res.drawable.color),
//                                        contentDescription = null,
//                                        tint = Color.Unspecified,
//                                        modifier = m
//                                            .size(22.dp)
//
//                                    )
//                                    Spacer(modifier = m.padding(horizontal = 2.dp))
//
//                                    Text(
//                                        "Black",
//                                        fontFamily = popSemi,
//                                        fontSize = 14.sp,
//                                        color = Color(102, 102, 102, 255)
//                                    )
//
//                                }
//
//                            } //car details
//                        } //card content
//
//
//                    }  // car card
//                } //car card
//                Row(
//                    horizontalArrangement = Arrangement.Center
//                ) {
//
//                } //card indicator
//                Spacer(modifier = m.padding(vertical = 36.dp))
//
//                Row(
//                    modifier = m
//                        .fillMaxWidth()
//                        .appButtonBack()
//                        .padding(horizontal = 20.dp)
//                        .height(height = 100.dp),
//                    horizontalArrangement = Arrangement.Center,
//                    verticalAlignment = Alignment.CenterVertically
//                ) {
//                    Text(
//                        "Upcoming \n Maintenance ",
//                        fontFamily = popSemi,
//                        fontSize = 24.sp,
//                        fontWeight = FontWeight.Bold,
//                        color = Color(255, 255, 255, 255)
//                    )
//                    Spacer(modifier = m.padding(horizontal = 20.dp))
//                    Column(
//                        horizontalAlignment = Alignment.CenterHorizontally
//                    ) {
//                        Box(
//                            modifier = m
//                                .size(40.dp)
//                                .border(
//                                    width = 1.dp,
//                                    Color(30, 30, 30, 110),
//                                    shape = RoundedCornerShape(8.dp)
//                                )
//                                .clip(RoundedCornerShape(8.dp))
//                                .background(Color(217, 217, 217, 255)),
//                            contentAlignment = Alignment.Center
//                        ) {
//                            Text(
//                                "10",
//                                fontFamily = popSemi,
//                                fontSize = 22.sp,
//                                fontWeight = FontWeight.Bold,
//                                color = Color(118, 118, 118, 255)
//                            )
//                        }
//                        Text(
//                            "Hour",
//                            fontFamily = popSemi,
//                            fontSize = 10.sp,
//                            fontWeight = FontWeight.Bold,
//                            color = Color(217, 217, 217, 255)
//                        )
//                    } //hour
//                    Spacer(modifier = m.padding(horizontal = 2.dp))
//                    Text(
//                        ":",
//                        fontFamily = popSemi,
//                        fontSize = 28.sp,
//                        fontWeight = FontWeight.Bold,
//                        color = Color(217, 217, 217, 255),
//                        modifier = m.offset(y = -7.dp)
//                    )
//                    Spacer(modifier = m.padding(horizontal = 2.dp))
//                    Column(
//                        horizontalAlignment = Alignment.CenterHorizontally
//                    ) {
//                        Box(
//                            modifier = m
//                                .size(40.dp)
//                                .border(
//                                    width = 1.dp,
//                                    Color(30, 30, 30, 110),
//                                    shape = RoundedCornerShape(8.dp)
//                                )
//                                .clip(RoundedCornerShape(8.dp))
//                                .background(Color(217, 217, 217, 255)),
//                            contentAlignment = Alignment.Center
//                        ) {
//                            Text(
//                                "10",
//                                fontFamily = popSemi,
//                                fontSize = 22.sp,
//                                fontWeight = FontWeight.Bold,
//                                color = Color(118, 118, 118, 255)
//                            )
//                        }
//                        Text(
//                            "Min",
//                            fontFamily = popSemi,
//                            fontSize = 10.sp,
//                            fontWeight = FontWeight.Bold,
//                            color = Color(217, 217, 217, 255)
//                        )
//                    } //Min
//                    Spacer(modifier = m.padding(horizontal = 2.dp))
//                    Text(
//                        ":",
//                        fontFamily = popSemi,
//                        fontSize = 28.sp,
//                        fontWeight = FontWeight.Bold,
//                        color = Color(217, 217, 217, 255),
//
//                        )
//                    Spacer(modifier = m.padding(horizontal = 2.dp))
//                    Column(
//                        horizontalAlignment = Alignment.CenterHorizontally
//                    ) {
//                        Box(
//                            modifier = m
//                                .size(40.dp)
//                                .border(
//                                    width = 1.dp,
//                                    Color(30, 30, 30, 110),
//                                    shape = RoundedCornerShape(8.dp)
//                                )
//                                .clip(RoundedCornerShape(8.dp))
//                                .background(Color(217, 217, 217, 255)),
//                            contentAlignment = Alignment.Center
//                        ) {
//                            Text(
//                                "10",
//                                fontFamily = popSemi,
//                                fontSize = 22.sp,
//                                fontWeight = FontWeight.Bold,
//                                color = Color(118, 118, 118, 255)
//                            )
//                        }
//                        Text(
//                            "Sec",
//                            fontFamily = popSemi,
//                            fontSize = 10.sp,
//                            fontWeight = FontWeight.Bold,
//                            color = Color(217, 217, 217, 255)
//                        )
//                    }//sec
//
//
//                } // upcoming maintenance
//                Spacer(modifier = m.padding(vertical = 30.dp))
//                Card(
//                    colors = CardDefaults.cardColors(containerColor = Color.Transparent),
//                    modifier = m
//                        .size(width = 360.dp, height = 170.dp)
//                        .clip(shape = RoundedCornerShape(15.dp))
//                        .background(Color(173, 0, 0, 255))
//                    //                        .appButtonBack(),
//                ) {
//                    Row(
//                        modifier = m
//                            .padding(horizontal = 10.dp, vertical = 12.dp)
//                            .fillMaxWidth(),
//                        horizontalArrangement = Arrangement.Start,
//                        verticalAlignment = Alignment.CenterVertically
//                    ) {
//                        Image(
//                            painter = painterResource(Res.drawable.cuate),
//                            contentDescription = null,
//                            modifier = m
//                                .size(200.dp, 140.dp)
//
//                        )
//                        Column(
//                            modifier = m
//                                .fillMaxSize(),
//                            verticalArrangement = Arrangement.Center,
//                            horizontalAlignment = Alignment.CenterHorizontally
//                        ) {
//                            Text(
//                                "OBD",
//                                fontFamily = popSemi,
//                                fontSize = 38.sp,
//                                fontWeight = FontWeight.Bold,
//                                color = Color(217, 217, 217, 255)
//                            ) // OBD
//                            Spacer(modifier = m.padding(vertical = 8.dp))
//
//                            Row(
//                                horizontalArrangement = Arrangement.Center,
//                                verticalAlignment = Alignment.CenterVertically
//                            ) {
//                                Text(
//                                    "More details",
//                                    fontFamily = popSemi,
//                                    fontSize = 12.sp,
//                                    fontWeight = FontWeight.Bold,
//                                    color = Color(217, 217, 217, 255)
//                                ) // more details
//                                Spacer(modifier = m.padding(horizontal = 4.dp))
//                                Icon(
//                                    painter = painterResource(Res.drawable.arrow_1),
//                                    contentDescription = null,
//                                    tint = Color.Unspecified,
//                                    modifier = m.size(12.dp)
//                                ) //arrow icon
//
//
//                            }
//
//                        }
//
//                    }
//
//
//                }
//
//            }
//
//
//        }
//    }
//
//}


//
//@Preview
//@Composable
//fun prev() {
//    HomeScreen()
//}