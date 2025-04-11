import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import androidx.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RegisterScreen(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {},
                navigationIcon = {
                    IconButton(onClick = {
                        navController.popBackStack()
                    }) {
                        Icon(Icons.Default.ArrowBack, contentDescription = "Volver")
                    }
                }
            )
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
                .padding(horizontal = 32.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                imageVector = Icons.Default.Person,
                contentDescription = null,
                modifier = Modifier.size(150.dp),
                colorFilter = ColorFilter.tint(Color(0xFFFF9900))
            )
            Spacer(modifier = Modifier.height(32.dp))

            Text(
                text = "Registrarse",
                fontSize = 24.sp,
                color = Color(0xFFFF9900),
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(32.dp))

            OutlinedTextField(
                value = "",
                onValueChange = {},
                modifier = Modifier.fillMaxWidth(),
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Email,
                        contentDescription = "Correo Electrónico",
                        tint = Color(0xFFFF9900)
                    )
                },
                label = {
                    Text(text = "Correo Electrónico")
                },
                shape = RoundedCornerShape(12.dp),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
            )

            Spacer(modifier = Modifier.height(32.dp))

            OutlinedTextField(
                value = "",
                onValueChange = {},
                modifier = Modifier.fillMaxWidth(),
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Person,
                        contentDescription = "Nombre Completo",
                        tint = Color(0xFFFF9900)
                    )
                },
                label = {
                    Text(text = "Nombre Completo")
                },
                shape = RoundedCornerShape(12.dp)
            )

            Spacer(modifier = Modifier.height(32.dp))

            OutlinedTextField(
                value = "",
                onValueChange = {},
                modifier = Modifier.fillMaxWidth(),
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Lock,
                        contentDescription = "Contraseña",
                        tint = Color(0xFFFF9900)
                    )
                },
                label = {
                    Text(text = "Contraseña")
                },
                shape = RoundedCornerShape(12.dp),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
            )

            Spacer(modifier = Modifier.height(32.dp))

            OutlinedTextField(
                value = "",
                onValueChange = {},
                modifier = Modifier.fillMaxWidth(),
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Lock,
                        contentDescription = "Confirmar Contraseña",
                        tint = Color(0xFFFF9900)
                    )
                },
                label = {
                    Text(text = "Confirmar Contraseña")
                },
                shape = RoundedCornerShape(12.dp),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
            )

            Spacer(modifier = Modifier.height(24.dp))

            Button(
                onClick = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp),
                shape = RoundedCornerShape(12.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFFF9900)
                )
            ) {
                Text("Registrarse")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun RegisterScreenPreview() {
    val navController = rememberNavController()
    RegisterScreen(navController = navController)
}
