namespace Loja.Data
{
    public class ProdutoContext : DbContext //Extendendo classe DbContext. Classe que auxilia na conexão  com o banco de dados.
    {
        public ProdutoContext(DbContextOptions<ProdutoContext> opt) : base(opt)
        {
            
        }
        
    }
}