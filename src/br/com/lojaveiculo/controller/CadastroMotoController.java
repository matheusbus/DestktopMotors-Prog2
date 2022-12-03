
package br.com.lojaveiculo.controller;

import br.com.lojaveiculo.dao.VeiculoDAO;
import br.com.lojaveiculo.model.Marca;
import br.com.lojaveiculo.model.Moto;
import br.com.lojaveiculo.repositorio.VeiculoRepositorio;
import br.com.lojaveiculo.view.CadastroMotoView;


public class CadastroMotoController extends BaseCadastroController {
    
    private CadastroMotoView cadastroMotoView;
    private Moto modeloMoto;
    private VeiculoRepositorio veiculoRepositorio;
 

    public CadastroMotoController() {     
        this.cadastroMotoView = new CadastroMotoView();
        this.modeloMoto = null;
        this.veiculoRepositorio = new VeiculoDAO();
    }
    
    public CadastroMotoController(CadastroMotoView cadastroMotoView, Moto modeloMoto) {
        this.cadastroMotoView = cadastroMotoView;
        this.modeloMoto = modeloMoto;
        this.veiculoRepositorio = new VeiculoDAO();
    }
    
    @Override
    public boolean verificaCamposNulos() {
      return cadastroMotoView.verificaCamposNulos();
    }

    @Override
    public void inicializarBotoes() {
            
    }

    @Override
    public void exibirTela() {
       cadastroMotoView.exibirTela();
    }
    
     @Override
    public void apresentarMensagem(String mensagem, String titulo) {
        cadastroMotoView.apresentaMensagem(mensagem, titulo);
    }
    
     @Override
    public void fecharTela() {
      
    }

    
    public boolean verificaPlaca(String placa){
        return cadastroMotoView.verificaLengthPlaca(placa);
    }
    
    
    public void acaoCadastrar(){
                if (verificaPlaca(cadastroMotoView.getPlaca())){
            if (verificaCamposNulos()) {
                try{
                    String sPlaca = cadastroMotoView.getPlaca().toUpperCase();
                    String sModelo = cadastroMotoView.getModelo();
                    Marca Marca = new Marca(cadastroMotoView.getMarca());
                    String sChassi = cadastroMotoView.getChassi();
                    String sCor = cadastroMotoView.getCor();
                    String sTipoCarroceira = cadastroMotoView.getCarroceria();
                    int iAno = Integer.parseInt(cadastroMotoView.getAno());
                    Double dPreco = Double.valueOf(cadastroMotoView.getPreco());
                    String sTipoCombustivel = cadastroMotoView.getCombustivel();
                    int iCilindradas = Integer.parseInt(cadastroMotoView.getCilindradas());

                    Moto novaMoto = new Moto(sPlaca, sModelo, Marca, sChassi, sCor, sTipoCarroceira, iAno, dPreco, sTipoCombustivel, iCilindradas);
                    
                    veiculoRepositorio.addVeiculo(novaMoto);

                    apresentarMensagem("Veículo cadastrado com sucesso.", "Cadastro realizado");
                    this.dispose();
                } catch (NumberFormatException ex) {
                    apresentarMensagem("Prencha os campos com valores válidos", "Erro");
                }
            } else {
                apresentarMensagem("Preencha todos os campos!", "Erro no cadastro");
            }
        } else {
            apresentarMensagem("A placa digitada é invalida!", "Erro no cadastro");
        }
    }
          
    public void acaoAlterar(){
        
    }

   
    

   
    
}
