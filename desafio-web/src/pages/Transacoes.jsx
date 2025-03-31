import { Button, Container, Typography } from "@mui/material";
import { criarTransacao } from "../services/transacoes";

const Transacoes = () => {
  const handleClick = async () => {
    const clienteId = 1;
    try {
      const response = await criarTransacao(clienteId);
      console.log("Transação criada:", response);

      const channel = new BroadcastChannel("transacao_channel");
      channel.postMessage({ clienteId });
    } catch (error) {
      console.error("Erro ao criar transação:", error);
    }
  };

  return (
    <Container>
      <Typography variant="h4" gutterBottom>Transações</Typography>
      <Button variant="contained" color="primary" onClick={handleClick}>
        Criar Transação
      </Button>
    </Container>
  );
};

export default Transacoes;
