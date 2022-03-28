package com.example.composeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.ColorRes
import androidx.annotation.Dimension
import androidx.compose.animation.animateColor
import androidx.compose.animation.core.*
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PaintingStyle.Companion.Stroke
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ChainStyle
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.ConstraintSet
import androidx.constraintlayout.compose.Dimension.Companion.value
import kotlinx.coroutines.launch
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxSize()) {
                CircularProgressBar(percentage = 0.75f)
            }

//            var sizeState by remember { mutableStateOf(200.dp) }
//            val size by animateDpAsState(
//                targetValue = sizeState,
//                tween(
//                    durationMillis = 3000,
//                    delayMillis = 300,
//                    easing = LinearOutSlowInEasing
//                )
//                spring(
//                    Spring.DampingRatioHighBouncy
//                )
//                keyframes {
//                    durationMillis = 5000
//                    sizeState at 0 with LinearEasing
//                    sizeState * 1.5f at 1000 with FastOutLinearInEasing
//                    sizeState * 2f at 5000
//                }
//            )

//            val infiniteTransition = rememberInfiniteTransition()
//            val color by infiniteTransition.animateColor(
//                initialValue    = Color.Red,
//                targetValue     = Color.Green,
//                animationSpec   = infiniteRepeatable(
//                    tween(
//                        durationMillis = 2000,
//                    ),
//                    repeatMode = RepeatMode.Reverse
//                )
//            )
//
//            Box(
//                modifier = Modifier
//                    .size(size)
//                    .background(color),
//                contentAlignment = Alignment.Center
//            ) {
//                Button(onClick = { sizeState += 50.dp }) {
//                    Text("Increase Size")
//                }
//            }

//            val constrains = ConstraintSet {
//                val greenBox  = createRefFor("greenBox")
//                val redBox    = createRefFor("redBox")
//                val guideLine = createGuidelineFromTop(0.5f)
//
//                constrain(greenBox) {
//                    top.linkTo(guideLine)
//                    start.linkTo(parent.start)
//                    width  = value(100.dp)
//                    height = value(100.dp)
//                }
//
//                constrain(redBox) {
//                    top.linkTo(greenBox.bottom)
//                    start.linkTo(greenBox.end)
//                    end.linkTo(parent.end)
//                    width  = value(100.dp)
//                    height = value(100.dp)
//                }
//
//                createHorizontalChain(greenBox, redBox, chainStyle = ChainStyle.Packed)
//            }
//
//            ConstraintLayout(constrains, modifier = Modifier.fillMaxSize()) {
//                Box(modifier = Modifier
//                    .background(Color.Green)
//                    .layoutId("greenBox")
//                )
//                Box(modifier = Modifier
//                    .background(Color.Red)
//                    .layoutId("redBox")
//                )
//            }


//            val scrollState = rememberScrollState()
//
//            LazyColumn() {
//                itemsIndexed(
//                    listOf("This", "Is", "Jetpack", "Compose")
//                ) {
//                    index, item ->
//                    Text(
//                        text = "Item #$index: $item",
//                        textAlign = TextAlign.Left,
//                        fontSize = 24.sp,
//                        fontWeight = FontWeight.Bold,
//                        modifier = Modifier
//                            .fillMaxWidth()
//                            .padding(vertical = 24.dp)
//                            .padding(start = 24.dp)
//                    )
//                }
//            }


//            LazyColumn() {
//                items(500) {
//                    Text(
//                        text = "Item: $it",
//                        textAlign = TextAlign.Center,
//                        fontSize = 24.sp,
//                        fontWeight = FontWeight.Bold,
//                        modifier = Modifier
//                            .fillMaxWidth()
//                            .padding(vertical = 24.dp)
//                    )
//                }
//            }

//            Column(
//                modifier = Modifier
//                    .verticalScroll(scrollState)
//            ) {
//                for (i in 1..50) {
//                    Text(
//                        text = "Item: $i",
//                        textAlign = TextAlign.Center,
//                        fontSize = 24.sp,
//                        fontWeight = FontWeight.Bold,
//                        modifier = Modifier
//                            .fillMaxWidth()
//                            .padding(vertical = 24.dp)
//                    )
//                }
//            }


//            val scaffoldState = rememberScaffoldState()
//            var textFieldState by remember {
//                mutableStateOf("")
//            }
//            val scope = rememberCoroutineScope()
//
//           Scaffold(
//               modifier = Modifier
//                   .fillMaxSize(),
//               scaffoldState = scaffoldState
//           ) {
//                Column(
//                    horizontalAlignment = Alignment.CenterHorizontally,
//                    verticalArrangement = Arrangement.Center,
//                    modifier = Modifier
//                        .fillMaxSize()
//                        .padding(horizontal = 30.dp)
//                ) {
//                    TextField(
//                        value = textFieldState,
//                        label = {
//                            Text(text = "Enter your name")
//                        },
//                        onValueChange = {
//                            textFieldState = it
//                        },
//                        singleLine = true,
//                        modifier = Modifier
//                            .fillMaxWidth()
//                    )
//                    Spacer(modifier = Modifier.height(16.dp))
//                    Button(onClick = {
//                        scope.launch {
//                            scaffoldState.snackbarHostState.showSnackbar(
//                                "Hello, $textFieldState"
//                            )
//                        }
//                    }) {
//                        Text(text = "PUSH ME")
//                    }
//                }
//            }


//            Column(Modifier.fillMaxSize()) {
//
//                val color = remember {
//                    mutableStateOf(Color.Yellow)
//                }
//
//                ColorBox(
//                    Modifier
//                        .weight(1f)
//                        .fillMaxSize(),
//                ) {
//                    color.value = it
//                }
//
//                Box(modifier = Modifier
//                    .background(color.value)
//                    .weight(1f)
//                    .fillMaxSize()
//                )
//
//            }

//            val fontFamily = FontFamily(
//                Font(R.font.lexend_thin, FontWeight.Thin),
//                Font(R.font.lexend_light, FontWeight.Light),
//                Font(R.font.lexend_regular, FontWeight.Normal),
//                Font(R.font.lexend_medium, FontWeight.Medium),
//                Font(R.font.lexend_semibold, FontWeight.SemiBold),
//                Font(R.font.lexend_bold, FontWeight.Bold),
//                Font(R.font.lexend_extrabold, FontWeight.ExtraBold),
//            )

//            val painter = painterResource(id = R.drawable.day1_tree)
//            val title = "My First Blender Tree"
//            val desc = "Tree sweet tree"

//            Box(
//                Modifier
//                    .fillMaxWidth(0.5f)
//                    .padding(16.dp)
//            ) {
//                ImageCard(
//                    painter = painter,
//                    contentDescription = desc,
//                    title = title)
//            }

        }
    }
}

@Composable
fun ColorBox(
    modifier: Modifier = Modifier,
    updateColor: (Color) -> Unit
) {

    Box(modifier = modifier
        .background(Color.Red)
        .clickable {
            updateColor(
                Color(
                    Random.nextFloat(),
                    Random.nextFloat(),
                    Random.nextFloat(),
                    1f
                )
            )
        }
    )
}

@Composable
fun ImageCard(
    painter: Painter,
    contentDescription: String,
    title: String,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(15.dp),
        elevation = 5.dp
    ) {
        Box(
            modifier = Modifier.height(200.dp)
        ) {

            // image
            Image(
                painter = painter,
                contentDescription = contentDescription,
                contentScale = ContentScale.Crop
            )

            // gradient at the bottom
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        Brush.verticalGradient(
                            colors = listOf(
                                Color.Transparent,
                                Color.Black
                            ),
                            startY = 400f
                        )
                    )
            ) {
                // no need anything here
            }

            // title text on the gradient
            Text(
                text = title,
                modifier = Modifier
                    .align(Alignment.BottomStart)
                    .padding(12.dp),
                style = TextStyle(color = Color.White, fontSize = 14.sp)
            )
        }
    }
}


/*
Column( // Col #1
                Modifier
                    .background(Color.Green)
                    .fillMaxHeight(0.5f)
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                Row( // row #1
                    Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(text = "Row ")
                    Text(text = "#1",
                        Modifier.clickable {

                        })
                }
                Row(  // row #2
                    Modifier.padding(vertical = 16.dp)
                        .border(5.dp, Color.Yellow)
                ) {
                    Column( // Col #2.1
                        Modifier
                            .background(Color.Black)
                            .fillMaxHeight()
                            .fillMaxWidth(0.5f)
                            .padding(16.dp)
                    ) {
                        Text(text = "Row #2: Column #1", color = Color.White)
                    }
                    Column( // Col #2.2
                        Modifier
                            .background(Color.DarkGray)
                            .fillMaxHeight()
                            .fillMaxWidth()
                            .padding(16.dp)
                    ) {
                        Text(text = "Row #2: Column #2", color = Color.White)
                    }
                }
            }
 */


/*

Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(0XFF101010))
            ) {
                Text(
                    text = buildAnnotatedString {
                        withStyle(
                            style = SpanStyle(
                                color = Color.Green,
                                fontSize = 50.sp
                            )
                        ) {
                            append("J")
                        }
                        append("etpack ")
                        withStyle(
                            style = SpanStyle(
                                color = Color.Green,
                                fontSize = 50.sp
                            )
                        ) {
                            append("C")
                        }
                        append("opmose")
                    },
                    color = Color.White,
                    fontSize = 30.sp,
                    fontFamily = fontFamily,
                    fontWeight = FontWeight.Light,
                    fontStyle = FontStyle.Normal,
                    textDecoration = TextDecoration.LineThrough
                )
            }
 */

@Composable
fun CircularProgressBar(
    percentage: Float,
    number: Int = 100,
    fonSize: TextUnit = 28.sp,
    radius: Dp = 30.dp,
    color: Color = Color.Red,
    strokeWidth: Dp = 3.dp,
    animDuration: Int = 1000,
    animDelay: Int = 1
) {

    val currentPercentage = remember {
        Animatable(0f)
    }

    LaunchedEffect(percentage) {
        currentPercentage.animateTo(
            percentage,
            animationSpec = tween(
                durationMillis = animDuration,
                delayMillis = animDelay
            )
        )
    }

    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .size(radius * 2f)
    ) {
        Canvas(
            modifier = Modifier.size(radius * 2f),
        ) {
            drawArc(
                color = color,
                90f,
                360 * currentPercentage.value,
                useCenter = false,
                style = Stroke(strokeWidth.toPx(), cap = StrokeCap.Round)
            )
        }
        
        Text(
            text = (currentPercentage.value * number).toInt().toString(),
            color = Color.Black,
            fontSize = fonSize,
            fontWeight = FontWeight.Bold
        )
    }
}