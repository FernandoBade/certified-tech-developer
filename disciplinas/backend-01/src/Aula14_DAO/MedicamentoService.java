package Aula14_DAO;

public class MedicamentoService {

    private IDao<Medicamento> medicamentoIDao;

    public MedicamentoService(IDao<Medicamento> medicamenteIDao) {
        this.medicamentoIDao = medicamenteIDao;
    }

    public Medicamento salvar(Medicamento medicamento) {
        return medicamentoIDao.salvar(medicamento);
    }

    public Medicamento buscar(Integer id) {
        return medicamentoIDao.buscar(id);
    }

}
