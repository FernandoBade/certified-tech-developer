public class PacienteService {


        private IDao<Paciente> pacienteDAO;

        public PacienteService(IDao<Paciente> pacienteDAO) {
            this.pacienteDAO = pacienteDAO;
        }

        public Paciente cadastrar(Paciente paciente) {
            return pacienteDAO.cadastrar(paciente);
        }

        public Paciente buscar(Integer id) {
            return pacienteDAO.buscar(id);
        }

        public Paciente excluir(Integer id) {
            return pacienteDAO.excluir(id);
        }

        public Paciente modificar(Paciente paciente) {
            return pacienteDAO.modificar(paciente);
        }


}
