// <auto-generated />
using System;
using LojaMVC2.Models;
using Microsoft.EntityFrameworkCore;
using Microsoft.EntityFrameworkCore.Infrastructure;
using Microsoft.EntityFrameworkCore.Metadata;
using Microsoft.EntityFrameworkCore.Migrations;
using Microsoft.EntityFrameworkCore.Storage.ValueConversion;

namespace LojaMVC2.Migrations
{
    [DbContext(typeof(LojaDbContext))]
    [Migration("20211217171953_LojaMVC")]
    partial class LojaMVC
    {
        protected override void BuildTargetModel(ModelBuilder modelBuilder)
        {
#pragma warning disable 612, 618
            modelBuilder
                .HasAnnotation("Relational:MaxIdentifierLength", 128)
                .HasAnnotation("ProductVersion", "5.0.12")
                .HasAnnotation("SqlServer:ValueGenerationStrategy", SqlServerValueGenerationStrategy.IdentityColumn);

            modelBuilder.Entity("LojaMVC2.Models.Cliente", b =>
                {
                    b.Property<int>("idCliente")
                        .ValueGeneratedOnAdd()
                        .HasColumnType("int")
                        .HasAnnotation("SqlServer:ValueGenerationStrategy", SqlServerValueGenerationStrategy.IdentityColumn);

                    b.Property<string>("Cpf")
                        .IsRequired()
                        .HasColumnType("nvarchar(max)");

                    b.Property<string>("Nome")
                        .IsRequired()
                        .HasColumnType("nvarchar(max)");

                    b.HasKey("idCliente");

                    b.ToTable("Cliente");
                });

            modelBuilder.Entity("LojaMVC2.Models.Pedido", b =>
                {
                    b.Property<int>("idPedido")
                        .ValueGeneratedOnAdd()
                        .HasColumnType("int")
                        .HasAnnotation("SqlServer:ValueGenerationStrategy", SqlServerValueGenerationStrategy.IdentityColumn);

                    b.Property<int>("ClienteId_cliente")
                        .HasColumnType("int");

                    b.Property<int?>("ClienteidCliente")
                        .HasColumnType("int");

                    b.Property<int?>("ProdutoIdProduto")
                        .HasColumnType("int");

                    b.Property<int>("ProdutoId_produto")
                        .HasColumnType("int");

                    b.HasKey("idPedido");

                    b.HasIndex("ClienteidCliente");

                    b.HasIndex("ProdutoIdProduto");

                    b.ToTable("Pedido");
                });

            modelBuilder.Entity("LojaMVC2.Models.Produto", b =>
                {
                    b.Property<int>("IdProduto")
                        .ValueGeneratedOnAdd()
                        .HasColumnType("int")
                        .HasAnnotation("SqlServer:ValueGenerationStrategy", SqlServerValueGenerationStrategy.IdentityColumn);

                    b.Property<string>("Url")
                        .HasColumnType("nvarchar(max)");

                    b.Property<string>("nomeProduto")
                        .IsRequired()
                        .HasColumnType("nvarchar(max)");

                    b.Property<decimal>("precoUnitario")
                        .HasColumnType("decimal(18,2)");

                    b.HasKey("IdProduto");

                    b.ToTable("Produto");
                });

            modelBuilder.Entity("LojaMVC2.Models.Pedido", b =>
                {
                    b.HasOne("LojaMVC2.Models.Cliente", "Cliente")
                        .WithMany()
                        .HasForeignKey("ClienteidCliente");

                    b.HasOne("LojaMVC2.Models.Produto", "Produto")
                        .WithMany()
                        .HasForeignKey("ProdutoIdProduto");

                    b.Navigation("Cliente");

                    b.Navigation("Produto");
                });
#pragma warning restore 612, 618
        }
    }
}
