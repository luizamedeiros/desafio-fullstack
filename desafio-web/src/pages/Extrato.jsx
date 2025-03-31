import { useEffect, useState } from "react";
import { Container, Typography } from "@mui/material";
import { getExtrato } from "../services/extrato";

const Extrato = () => {
  const [extrato, setExtrato] = useState(null);

  useEffect(() => {
    const channel = new BroadcastChannel("transacao_channel");

    channel.onmessage = async (event) => {
      const { clienteId } = event.data;
      const response = await getExtrato(clienteId);
      setExtrato(response);
    };

    return () => channel.close();
  }, []);

  return (
    <Container>
      <Typography variant="h4" gutterBottom>Extrato</Typography>
      <pre>{JSON.stringify(extrato, null, 2)}</pre>
    </Container>
  );
};

export default Extrato;
