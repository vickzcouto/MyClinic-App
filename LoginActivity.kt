import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val patientLoginButton = findViewById<Button>(R.id.patientLoginButton)
        val psychologistLoginButton = findViewById<Button>(R.id.psychologistLoginButton)

        patientLoginButton.setOnClickListener {
            // Lógica de login do paciente
        }

        psychologistLoginButton.setOnClickListener {
            // Lógica de login do psicólogo
        }
    }
}

class PatientDashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_patient_dashboard)

        val presencialAgendamentoButton = findViewById<Button>(R.id.presencialAgendamentoButton)
        val onlineAgendamentoButton = findViewById<Button>(R.id.onlineAgendamentoButton)
        val minhasConsultasButton = findViewById<Button>(R.id.minhasConsultasButton)
        val documentosButton = findViewById<Button>(R.id.documentosButton)

        // Adicione os ouvintes de clique e a lógica apropriada
    }
}

class PsychologistDashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_psychologist_dashboard)

        val calendarButton = findViewById<Button>(R.id.calendarButton)
        val definirHorariosButton = findViewById<Button>(R.id.definirHorariosButton)
        val reagendamentosButton = findViewById<Button>(R.id.reagendamentosButton)
        val listaPacientesButton = findViewById<Button>(R.id.listaPacientesButton)

        // Adicione os ouvintes de clique e a lógica apropriada
    }
}
