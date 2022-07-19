/*
 * Copyright © 2022 JINSPIRED B.V.
 */

package io.modulis.gauges.spi.alpha;

import io.humainary.gauges.Gauges;
import io.humainary.gauges.spi.GaugesProvider;
import io.humainary.substrates.sdk.AbstractContextProvider;

/**
 * The SPI implementation of {@link GaugesProvider}.
 *
 * @author wlouth
 * @since 1.0
 */

final class Provider
  extends AbstractContextProvider< Gauges.Gauge, Context >
  implements GaugesProvider {

  Provider () {

    super (
      environment ->
        new Context (
          environment,
          Gauge::new
        )
    );

  }

}
